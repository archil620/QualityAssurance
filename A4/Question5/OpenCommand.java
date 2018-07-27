public class OpenCommand implements BaseCommand {

	@Override
	public String getCommand() {
		
		return "open -f <path> [-create=0/1]";
	}

}
