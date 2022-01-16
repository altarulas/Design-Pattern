public class OfficeCompIterator implements Iterator {
	CompItem[] items;
	int position = 0;
 
	public OfficeCompIterator(CompItem[] items) {
		this.items = items;
	}
 
	public CompItem next() {
		return items[position++];
	}
 
	public boolean hasNext() {
		return items.length > position;
	}
}
