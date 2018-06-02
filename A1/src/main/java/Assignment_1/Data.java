package Assignment_1;
import java.util.ArrayList;
import java.util.List;
//Mock data of the dealer
public class Data {

	public List<Dealer> getDealerData() {
		List<Dealer> dealer = new ArrayList<>();
		Dealer dealer1 = new Dealer();
		dealer1.setDealerid("XXX-1234-ABCD-1234");
		dealer1.setDealeraccesskey("kkklas8882kk23nllfjj88290");
		
		Dealer dealer2 = new Dealer();
		dealer2.setDealerid("ABS-2324-ADAD-1245");
		dealer2.setDealeraccesskey("ABCD5678WXYZ5678");
		
		Dealer dealer3 = new Dealer();
		dealer3.setDealerid("9101-9879-bhbh-oiuy");
		dealer3.setDealeraccesskey("ABCD5678WXYZ1234");
		
		dealer.add(dealer1);
		dealer.add(dealer2);
		dealer.add(dealer3);
		return dealer;
	}
	
		
	
	public List<Deliveryaddress> getDeliveryaddressData() {
			List<Deliveryaddress> deliveryaddress = new ArrayList<>();
			
			Deliveryaddress dealer1 = new Deliveryaddress();
			dealer1.setName("Mrs. Jane Smith");
			dealer1.setStreet("35 Streetname");
			dealer1.setCity("Halifax");
			dealer1.setProvince("NS");
			dealer1.setPostalcode("B2T1A4");
			
			
			Deliveryaddress dealer2 = new Deliveryaddress();
			dealer2.setName("wick");
			dealer2.setStreet("Monastery road");
			dealer2.setCity("Halifax");
			dealer2.setProvince("Nova Scotia");
			dealer2.setPostalcode("B3j2k9");
			
			
			Deliveryaddress dealer3 = new Deliveryaddress();
			dealer3.setName("chris");
			dealer3.setStreet("Queen road");
			dealer3.setCity("Thunderbay");
			dealer3.setProvince("Ontario");
			dealer3.setPostalcode("l123cs");
			
			deliveryaddress.add(dealer1);
			deliveryaddress.add(dealer2);
			deliveryaddress.add(dealer3);
			
			return deliveryaddress;
			
		}
			
			
	
		
	public List<Item>  getItemData() {
		List<Item> itemlist = new ArrayList<>();
		      
			   Item dealer1 = new Item();
		       dealer1.setPartnumber("1234");
		       dealer1.setQuantity("2");
		       
		       
		       Item dealer2 = new Item();
		       dealer2.setPartnumber("5678");
		       dealer2.setQuantity("25");
		       
		       Item dealer3 = new Item();
		       dealer3.setPartnumber("1256");
		       dealer3.setQuantity("24");
		       
		       itemlist.add(dealer1);
		       itemlist.add(dealer2);
		       itemlist.add(dealer3);
		      
		       return itemlist;
		}
}		
