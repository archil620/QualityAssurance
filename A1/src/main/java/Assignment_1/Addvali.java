package Assignment_1;


import java.util.List;

public class Addvali implements ValDelivery {
	
	@Override
	public boolean IsDeliveryaddressValid(String name, String street, String city, String province, String postalcode) {
		// TODO Auto-generated method stub
		
		Data data = new Data();
		List<Deliveryaddress> deliveryaddress = data.getDeliveryaddressData();
		
		for(Deliveryaddress d: deliveryaddress) {
			if(name.equals(d.name) && street.equals(d.street) && city.equals(d.city) && province.equals(d.province) && postalcode.equals(d.postalcode)) {
				return true;
		    }
		}
		
		
		return false;
	}
}
