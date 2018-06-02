package Assignment_1;

/*JournalDev. (2018). How to validate XML against XSD in Java - JournalDev. [online] Available at: https://www.journaldev.com/895/how-to-validate-xml-against-xsd-in-java [Accessed 30 May 2018].
*/
//dzone.com. (2018). Marshalling and Unmarshalling in JAXB 2.0 - DZone Java. [online] Available at: https://dzone.com/articles/introduction-to-jaxb-20 [Accessed 1 Jun. 2018].


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class Validate {

	// For validating XML
	public static void main(final String[] arguments) {
		boolean flag = true;
		try {
			validate(arguments[0], "order.xsd");
		} catch (SAXException e) {
			flag = false;
		} catch (IOException e) {
			flag = false;
			System.err.println(e.getMessage());
		}
		System.out.println("xml file is valid:" + flag);
		
		if(flag == true) {

		try {
			// This will convert XML to desired JAVA object tree
			File file = new File(arguments[0]);
			JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Order order = (Order) jaxbUnmarshaller.unmarshal(file);

			// For authorizing the dealer
			Security security = new ISecurity();
			boolean val1 = security.IsDealerAuthorized(order.getDealer().getDealerid(),
					order.getDealer().getDealeraccesskey());
			

			if (val1 == true) {
				System.out.println("Dealer Authorized");
				// For authorizing Delivery_address
				ValDelivery val = new Addvali();
				boolean val2 = val.IsDeliveryaddressValid(order.getDeliveryaddress().getName(),
						order.getDeliveryaddress().getStreet(), order.getDeliveryaddress().getCity(),
						order.getDeliveryaddress().getProvince(), order.getDeliveryaddress().getPostalcode());
				if(val2==true)
				{
				System.out.println("Delivery Address Authorized");

				// For authorizing Item
				Response_generator validator = new Response_generator();
				List<Item> item = order.getItemlist();
				List<Item> items = new ArrayList<Item>();
				Order rs = new Order();

				Item i = new Item();
				int x = 0;
				for (x = 0; x < item.size(); x++) {

					System.out.println("item :" + item.get(x).getPartnumber() + ":"
							+ validator.SubmitPartForManufactureAndDelivery(
									Integer.parseInt(item.get(x).getPartnumber()),
									Integer.parseInt(item.get(x).getQuantity()), order.getDeliveryaddress()));

					if (validator
							.SubmitPartForManufactureAndDelivery(Integer.parseInt(item.get(x).getPartnumber()),
									Integer.parseInt(item.get(x).getQuantity()), order.getDeliveryaddress())
							.toString().equals("SUCCESS")) {
						items.add(item.get(x));
						rs.setItemlist(items);

						
					}

					else if (validator
							.SubmitPartForManufactureAndDelivery(Integer.parseInt(item.get(x).getPartnumber()),
									Integer.parseInt(item.get(x).getQuantity()), order.getDeliveryaddress())
							.toString().equals("OUT_OF_STOCK")) {
						
						

						i.setResult("failure");
						i.setError("Out of stock");
						i.setErrormessage("Invalid order item entry");
						items.add(i);
					    rs.setItemlist(items);
					}

					else if (validator
							.SubmitPartForManufactureAndDelivery(Integer.parseInt(item.get(x).getPartnumber()),
									Integer.parseInt(item.get(x).getQuantity()), order.getDeliveryaddress())
							.toString().equals("NO_LONGER_MANUFACTURED")) {

						i.setResult("failure");
						i.setError("No longer produced");
						i.setErrormessage("Invalid order item list");
						items.add(i);

						rs.setItemlist(items);
					}

				}
				JAXBContext marshRes = JAXBContext.newInstance(Order.class);
				Marshaller jaxbMarshaller = marshRes.createMarshaller();
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				jaxbMarshaller.marshal(rs, System.out);
			}
				
				else if (val2==false) {
					System.out.println("Delivery Address is not Authorized");
				}
				
			}
			

			// If dealer is not Authorized
			else {
				Order obj = new Order();
				
				obj.setResult("failure");
				obj.setError("Not authorized");

				// Used to generate XML script
				JAXBContext marsh = JAXBContext.newInstance(Order.class);
				Marshaller jaxbMarshaller = marsh.createMarshaller();
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				jaxbMarshaller.marshal(obj, System.out);
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		}else {
			
			System.out.println("Enter valid XML");
		}

	}

	// XML validation code
	public static void validate(String xmlFile, String validationFile) throws SAXException, IOException {
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		((schemaFactory.newSchema(new File(validationFile))).newValidator())
				.validate(new StreamSource(new File(xmlFile)));
	}

}