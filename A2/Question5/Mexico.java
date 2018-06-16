package SOLIDAssignment.Question5;

public class Mexico implements PrintReport
{
	public String getAgriculture()
	{
		return "$50000000 MXN";
	}

	public String getTourism()
	{
		return "$100000 MXN";
	}
	
	
	public void PrintCountryGDPReport()
	{
		System.out.println("GDP By Country:\n");
		System.out.println("- Mexico:\n");
		System.out.println("   - Agriculture: " + getAgriculture());
		System.out.println("   - Tourism: " + getTourism());
	}
}