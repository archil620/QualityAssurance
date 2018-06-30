//http://www.newthinktank.com/2012/08/observer-design-pattern-tutorial/

public interface ISubject {
	
	public void register(IObserver obj);
	public void unregister(IObserver obj);
	public void notifyObservers(BoardComponent parent);
	
	
	

}
