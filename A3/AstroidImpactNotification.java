import java.util.ArrayList;

public class AstroidImpactNotification implements ISubject {
	
	

	@Override
	public void register(IObserver obj) {
		// TODO Auto-generated method stub
		GameBoard.Instance().setObservers(obj);
	}

	@Override
	public void unregister(IObserver obj) {
		// TODO Auto-generated method stub
		int i = GameBoard.Instance().getObservers().indexOf(obj);
		GameBoard.Instance().getObservers().remove(i);
		System.out.println("Observer removed: " + obj);	
	}

	@Override
	public void notifyObservers(BoardComponent parent) {
		// TODO Auto-generated method stub
		
		
		
	}

	
}
