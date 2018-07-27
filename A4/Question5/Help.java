import java.util.HashMap;

public class Help
{
	
	HashMap<String,BaseCommand> hashmap = new HashMap<String, BaseCommand>();
	
	public String GetHelp(String command)
	{
		hashmap.put("print",new PrintCommand());
		hashmap.put("open",new OpenCommand());
		hashmap.put("close",new CloseCommand());
		
		
		if (command != null && command.length() != 0)
		{
			return hashmap.get(command).getCommand();
		}
		return ListAllCommands();
	}

	public String ListAllCommands()
	{
		return "Commands: print, open, close";
	}
}