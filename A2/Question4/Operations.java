package SOLIDAssignment.Question4;

public class Operations extends BankAccount {
	
	public void Credit(float amount)
	{
		balance += amount;
	}

	public void Debit(float amount)
	{
		balance -= amount;
	}

}
