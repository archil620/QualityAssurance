package Assignment_1;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

public class Response_generator implements PARTMANAGER {

	@Override
	public PartResponse SubmitPartForManufactureAndDelivery(int partNumber, int quantity,
			Deliveryaddress deliveryaddress) {
		// TODO Auto-generated method stub
		
		
		Data data =new Data();
		List<Item> itemlist = data.getItemData();
		
		int x;
		
		for(x=0;x<itemlist.size();x++) {
			
			if(itemlist.get(x).getPartnumber().equals(Integer.toString(partNumber))) {
				if(quantity <= Integer.parseInt(itemlist.get(x).getQuantity())) {
					return PartResponse.SUCCESS;
				}
				else if(quantity > Integer.parseInt(itemlist.get(x).getQuantity())) {
					return PartResponse.OUT_OF_STOCK;
				}
				
			}
		}
		
		return PartResponse.NO_LONGER_MANUFACTURED;
	}
	
	

}
