package SOLIDAssignment.Question2;

import java.time.Duration;
import java.util.ArrayList;

public interface Idvd {
	
	public Duration GetPlayTime();
	public String GetTitle();
	public boolean IsDigitalOnly();
	public ArrayList<String> GetCastList();

}
