import java.util.ArrayList;

public class Shield extends ShieldDecorator implements IObserver  {
	
	

	int ShieldHealth;
	protected BoardComponent boardcomponent;
	AstroidImpactNotification notification = new AstroidImpactNotification();
	private int x,y;

	
	public Shield(BoardComponent boardcomponent) {
		
		super(boardcomponent);
		ShieldHealth=2;
		notification.register(this);
		
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Add(BoardComponent child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Remove(BoardComponent child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(int x, int y) {
		// TODO Auto-generated method stub
		 ShieldHealth = ShieldHealth -1;
         if (ShieldHealth == 0)
         {
             ArrayList<ArrayList<BoardComponent>> b = GameBoard.Instance().GetBoard();
             b.get(x).set(y,boardcomponent);
             System.out.println("Removing Shield on: " + x + " " + y);
             
         	 
         
         }
		
		
	}

	
}
