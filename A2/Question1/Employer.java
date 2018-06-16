package Question1;

import java.util.ArrayList;

public class Employer 
{
	
	ArrayList<Iworker> iworker;
	
	
	

	public Employer()
	{
		iworker = new ArrayList<Iworker>();
		
		for (int i = 0; i < 5; i++)
		{
			iworker.add(new HourlyWorker());
		    iworker.add(new SalaryWorker());
		}
	}

	public void outputWageCostsForAllStaff(int hours)
	{
		float cost = 0.0f;
		for (int i = 0; i < iworker.size(); i++)
		{
			Iworker worker = iworker.get(i);
			cost += worker.calculatePay(hours);
		}
		
		System.out.println("Total wage cost for all staff = $" + cost);
	}
}