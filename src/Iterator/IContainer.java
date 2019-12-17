package Iterator;

import Iterator.IIterator;

public interface IContainer<T> {
	
	public IIterator<T> getIterator();
	
}
