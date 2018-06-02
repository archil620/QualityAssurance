package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import Assignment_1.Addvali;
import Assignment_1.Data;
import Assignment_1.Dealer;
import Assignment_1.Deliveryaddress;
import Assignment_1.ISecurity;
import Assignment_1.Item;
import Assignment_1.ItemVal;
import Assignment_1.Order;
import Assignment_1.Response_generator;
import Assignment_1.Validate;

@RunWith(MockitoJUnitRunner.class)
public class OrderTestcases {
	
	@InjectMocks
	Order order;
	
	@InjectMocks
	Addvali adavali;
	
	@InjectMocks
	Data data;
	
	@InjectMocks
	Dealer dealer;
	
	@InjectMocks
	Deliveryaddress deliveryaddress;
	
	@InjectMocks
	ISecurity isecurity;
	
	@InjectMocks
	Item item;
	
	@InjectMocks
	ItemVal itemval;
	
	@InjectMocks
	Response_generator response_generator;
	
	@InjectMocks
	Validate validate;
	
	@Test
	public void IsDealerAuthorizeTestfalse() {
		dealer.setDealerid("False case");
		dealer.setDealeraccesskey("gssgdgsgdgdgdwrong");
		assertEquals(false, isecurity.IsDealerAuthorized(dealer.getDealerid(), dealer.getDealeraccesskey()));
	}
	
	@Test
	public void IsDealerAuthorizeTesttrue() {
		dealer.setDealerid("XXX-1234-ABCD-1234");
		dealer.setDealeraccesskey("kkklas8882kk23nllfjj88290");
		assertEquals(true, isecurity.IsDealerAuthorized(dealer.getDealerid(), dealer.getDealeraccesskey()));
	}
	
	@Test
	public void IsDealerAuthorizeTestfalsekey() {
		dealer.setDealerid("XXX-1234-ABCD-1234");
		dealer.setDealeraccesskey("kkk");
		assertEquals(false, isecurity.IsDealerAuthorized(dealer.getDealerid(), dealer.getDealeraccesskey()));
	}
	
	
	@Test
	public void IsDealerAuthorizeTestfalseid() {
		dealer.setDealerid("XXX-1234");
		dealer.setDealeraccesskey("kkklas8882kk23nllfjj88290");
		assertEquals(false, isecurity.IsDealerAuthorized(dealer.getDealerid(), dealer.getDealeraccesskey()));
	}
	
	
	@Test
	public void IsDeliveryaddressValidtrue() {
		deliveryaddress.setName("Mrs. Jane Smith");
		deliveryaddress.setStreet("35 Streetname");
		deliveryaddress.setCity("Halifax");
		deliveryaddress.setProvince("NS");
		deliveryaddress.setPostalcode("B2T1A4");
		assertEquals(true, adavali.IsDeliveryaddressValid(deliveryaddress.getName(),deliveryaddress.getStreet(),deliveryaddress.getCity(),deliveryaddress.getProvince(),deliveryaddress.getPostalcode()));
	}
	
	@Test
	public void IsDeliveryaddressValidfalse() {
		deliveryaddress.setName(" Smith");
		deliveryaddress.setStreet("name");
		deliveryaddress.setCity("fax");
		deliveryaddress.setProvince("S");
		deliveryaddress.setPostalcode("BT1A4");
		assertEquals(false, adavali.IsDeliveryaddressValid(deliveryaddress.getName(),deliveryaddress.getStreet(),deliveryaddress.getCity(),deliveryaddress.getProvince(),deliveryaddress.getPostalcode()));
	}
	
	
	@Test
	public void IsDeliveryaddressValidFalsename() {
		deliveryaddress.setName(" Jane Smith");
		deliveryaddress.setStreet("35 Streetname");
		deliveryaddress.setCity("Halifax");
		deliveryaddress.setProvince("NS");
		deliveryaddress.setPostalcode("B2T1A4");
		assertEquals(false, adavali.IsDeliveryaddressValid(deliveryaddress.getName(),deliveryaddress.getStreet(),deliveryaddress.getCity(),deliveryaddress.getProvince(),deliveryaddress.getPostalcode()));
	}
	
	@Test
	public void XMLvalid()
	{
		validate.main(new String[] {"order.xml"});
		//Validate.main(new String[]);
	}
	
	@Test
	public void XMLinvalid()
	{
		validate.main(new String[] {"fakeorder.xml"});
		//Validate.main(new String[]);
	}
	@Test
	public void IsDeliveryaddressValidfalsestreet() {
		deliveryaddress.setName("Mrs. Jane Smith");
		deliveryaddress.setStreet("35");
		deliveryaddress.setCity("Halifax");
		deliveryaddress.setProvince("NS");
		deliveryaddress.setPostalcode("B2T1A4");
		assertEquals(false, adavali.IsDeliveryaddressValid(deliveryaddress.getName(),deliveryaddress.getStreet(),deliveryaddress.getCity(),deliveryaddress.getProvince(),deliveryaddress.getPostalcode()));
	}
	
	@Test
	public void IsDeliveryaddressValidfalsecity() {
		deliveryaddress.setName("Mrs. Jane Smith");
		deliveryaddress.setStreet("35 Streetname");
		deliveryaddress.setCity("nosoad");
		deliveryaddress.setProvince("NS");
		deliveryaddress.setPostalcode("B2T1A4");
		assertEquals(false, adavali.IsDeliveryaddressValid(deliveryaddress.getName(),deliveryaddress.getStreet(),deliveryaddress.getCity(),deliveryaddress.getProvince(),deliveryaddress.getPostalcode()));
	}
	
	@Test
	public void IsDeliveryaddressValidfalseProvince() {
		deliveryaddress.setName("Mrs. Jane Smith");
		deliveryaddress.setStreet("35 Streetname");
		deliveryaddress.setCity("Halifax");
		deliveryaddress.setProvince("NB");
		deliveryaddress.setPostalcode("B2T1A4");
		assertEquals(false, adavali.IsDeliveryaddressValid(deliveryaddress.getName(),deliveryaddress.getStreet(),deliveryaddress.getCity(),deliveryaddress.getProvince(),deliveryaddress.getPostalcode()));
	}
	
	@Test
	public void IsDeliveryaddressValidfalsepostalcode() {
		deliveryaddress.setName("Mrs. Jane Smith");
		deliveryaddress.setStreet("35 Streetname");
		deliveryaddress.setCity("Halifax");
		deliveryaddress.setProvince("NS");
		deliveryaddress.setPostalcode("B2T4");
		assertEquals(false, adavali.IsDeliveryaddressValid(deliveryaddress.getName(),deliveryaddress.getStreet(),deliveryaddress.getCity(),deliveryaddress.getProvince(),deliveryaddress.getPostalcode()));
	}
	
	
	
	@Test
	public void IsItemAuthorizedtrue() {
		item.setPartnumber("1234");
		item.setQuantity("2");
		assertEquals("SUCCESS", response_generator.SubmitPartForManufactureAndDelivery(Integer.parseInt(item.getPartnumber()), Integer.parseInt(item.getQuantity()), deliveryaddress).toString());
	}
	
	@Test
	public void IsItemAuthorizedfalse() {
		item.setPartnumber("12");
		item.setQuantity("");
		assertEquals(false, itemval.IsItemAuthorized(item.getPartnumber(),item.getQuantity()));
	}
	
	@Test
	public void IsItemAuthorizefalseQuantity() {
		item.setPartnumber("1234");
		item.setQuantity("43535");
		assertEquals("OUT_OF_STOCK", response_generator.SubmitPartForManufactureAndDelivery(Integer.parseInt(item.getPartnumber()), Integer.parseInt(item.getQuantity()), deliveryaddress).toString());
	}
	
	@Test
	public void IsItemAuthorizefalsePartnumber() {
		item.setPartnumber("34");
		item.setQuantity("12");
		assertEquals("NO_LONGER_MANUFACTURED", response_generator.SubmitPartForManufactureAndDelivery(Integer.parseInt(item.getPartnumber()), Integer.parseInt(item.getQuantity()), deliveryaddress).toString());
	}
	
	@Test
	public void XMLdatavalid()
	{
		validate.main(new String[] {"fake_result.xml"});
		//Validate.main(new String[]);
	}
	
	
	
	@Test
	public void XMLunauthorisexdealer()
	{
		validate.main(new String[] {"UNauthoriseddealer.xml"});
		//Validate.main(new String[]);
	}
	
	
	
	
	

	

}
