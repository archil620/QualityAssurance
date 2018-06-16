package SOLIDAssignment.Question5;

import java.util.ArrayList;

import Question1.HourlyWorker;
import Question1.Iworker;
import Question1.SalaryWorker;


public class CountryGDPReport 
{
	ArrayList<PrintReport> p;
	
	public CountryGDPReport() {
		
		p = new ArrayList<PrintReport>();
		
		for (int i = 0; i < 5; i++)
		{
			p.add(new Canada());
		    p.add(new Mexico());
		}
		
	}
	
	public void PrintCountryGDPReport()
	{
		for (int i = 0; i < p.size(); i++)
		{
			PrintReport pre = p.get(i);
			pre.PrintCountryGDPReport();
		}
		
	}
	
}