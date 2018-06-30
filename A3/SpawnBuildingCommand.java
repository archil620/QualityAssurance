public class SpawnBuildingCommand extends Command {

	public SpawnBuildingCommand(Object receiver, String[] args) {
		super(receiver, args);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		// The receiver for the SpawnAsteroidCommand is the Square to spawn the asteroid in.
				Square square = (Square) receiver;
				IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
				System.out.println("Spawning building at (" + args[0] + "," + args[1] + ")");
				square.Add(factory.MakeBuilding());
				GameBoard.Instance().IncrementBuildingCount();
				
		
	}

}
