// The abstract class (interface) all Command pattern objects extend.
public abstract class Command
{	
	protected Object receiver;
	protected String[] args;
			  
	public Command(Object receiver, String[] args)
	{
		this.receiver = receiver;
		this.args = args;
	}
	
	public Command(Object receiver) {

		this.receiver=receiver;
    }
	
	public abstract void Execute();
}