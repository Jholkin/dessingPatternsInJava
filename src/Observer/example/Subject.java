package Observer.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject implements ISubject {

	private List<IObserver> observers = new ArrayList<>();

	public void addObserver(IObserver observer) {
		this.observers.add(observer);
	}

	public void removeObserver(IObserver observer) {
		this.observers.remove(observer);
	}

	public void notifyAllObservers(String cadena, Object objeto) {
		for (IObserver observer : observers) {
			observer.notifyObserver(cadena, objeto);
		}
	}
}
