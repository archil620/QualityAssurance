import java.util.ArrayList;

public class SpawnShieldCommand extends Command {

	public SpawnShieldCommand(Object receiver, String[] args) {
		super(receiver, args);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		
		 Square square = (Square) receiver;
		 System.out.println("Spawning Sheild at (" + args[0] + "," + args[1] + ")");
		IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
		BoardComponent b = factory.Makeshield(square);
		GameBoard.Instance().GetBoard().get(Integer.parseInt(args[0])).set(Integer.parseInt(args[0]), b);
	   
	       
	        


	       
		
	}

}
