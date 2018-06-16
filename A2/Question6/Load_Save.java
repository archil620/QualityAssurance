package SOLIDAssignment.Question6;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Load_Save extends PiggyBank {
	

	public void Save()
	{
		try
		{
			PrintWriter writer = new PrintWriter("piggybank.txt", "UTF-8");
			writer.println(Integer.toString(numPennies));
			writer.println(Integer.toString(numDimes));
			writer.println(Integer.toString(numNickels));
			writer.println(Integer.toString(numQuarters));
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}

	public void Load()
	{
		try
		{
			Scanner in = new Scanner(new FileReader("piggybank.txt"));
			numPennies = Integer.parseInt(in.next());
			numDimes = Integer.parseInt(in.next());
			numNickels = Integer.parseInt(in.next());
			numQuarters = Integer.parseInt(in.next());
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}

}
