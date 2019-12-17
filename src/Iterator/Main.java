package Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IteratorPattern iteratorPattern = new IteratorPattern();
		
		IIterator myIterator = iteratorPattern.getIterator();
		
		while (myIterator.hasNext()) {
			System.out.print(myIterator.next() + " - ");			
		}
	}

}
