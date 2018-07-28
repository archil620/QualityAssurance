public class OpenCommand implements IBaseCommand {

	@Override
	public String getCommand() {
		
		return "open -f <path> [-create=0/1]";
	}

}
