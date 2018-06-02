package Assignment_1;
import java.util.List;

public class ISecurity implements Security {

	@Override
	public boolean IsDealerAuthorized(String dealerid, String dealeraccesskey) {
		// TODO Auto-generated method stub

		Data data = new Data();
		List < Dealer > dealers = data.getDealerData();
		for (Dealer d: dealers) {
			if (dealerid.equals(d.dealerid) && dealeraccesskey.equals(d.dealeraccesskey)) {
				return true;
			}

		}
		return false;
	}

}