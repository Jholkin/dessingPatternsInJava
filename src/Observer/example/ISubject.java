package Observer.example;

public interface ISubject {

	public void addObserver(IObserver observer);
	
	public void removeObserver(IObserver observer);
	
	public void notifyAllObservers(String cadena, Object objeto);
}
