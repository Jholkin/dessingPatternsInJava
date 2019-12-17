package Iterator;

public class IteratorPattern implements IContainer<String> {

	public IIterator<String> getIterator() {
		return new MonthCollection();
	}
	
	private class MonthCollection implements IIterator<String> {
		private String[] months = {"January", "Febraury", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December"};
		private int index = 0;
		
		public boolean hasNext() {
			return index < months.length ?  true : false;
		}
		
		public String next() {
			if (hasNext()) {
				return months[index++];
			}
			return null;
		}
	}
	
}
