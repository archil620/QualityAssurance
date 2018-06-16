package SOLIDAssignment.Question2;

import java.time.Duration;


public class Book implements Ilibrary
{
	public Duration GetPlayTime()
	{
		return Duration.ZERO;
	}

	public String GetAuthor()
	{
		return "Hemingway";
	}

	public String GetTitle()
	{
		return "For Whom The Bell Tolls";
	}

	public boolean IsDigitalOnly()
	{
		return false;
	}
}