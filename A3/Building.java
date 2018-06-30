// Building is the leaf node for the composite pattern, Square's can have MULTIPLE Buildings
// Buildings cannot have children.
public class Building extends BoardComponent implements IObserver
{
	private int buildingHealth;
	
	AstroidImpactNotification notification= new AstroidImpactNotification();
	
	public Building()
	{
		super();
		buildingHealth = 2;
		notification.register(this);
	}

	@Override
	public void Operation()
	{
		// Buildings just stand there, they don't do anything.
	}

	@Override
	public void Add(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
		notification.unregister(this);
	}

	@Override
	public void Update(int x, int y) {
		// TODO Auto-generated method stub

		buildingHealth-=1;

		if (buildingHealth == 0)
		{
			parent.Remove(this);
			
			GameBoard.Instance().DecrementBuildingCount();
			
			System.out.println("Removing buildings  on: " + x + " " + y);
		}
	}
		
}
	
	
