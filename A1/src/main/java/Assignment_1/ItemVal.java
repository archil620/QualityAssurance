package Assignment_1;
import java.util.List;

public class ItemVal implements ItemValidate {

	@Override
	public boolean IsItemAuthorized(String partnumber, String qantity) {
		// TODO Auto-generated method stub
		Data data = new Data();
		List<Item> item = data.getItemData();
		
		for(Item d: item) {
			if(partnumber.equals(d.partnumber) && qantity.equals(d.quantity)) {
				return true;
			}
			
		}	

		return false;
	}

}
