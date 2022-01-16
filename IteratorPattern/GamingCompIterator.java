import java.util.ArrayList;

public class GamingCompIterator implements Iterator {
	ArrayList<CompItem> items;
	int position = 0;
 
	public GamingCompIterator(ArrayList<CompItem> items) {
		this.items = items;
	}
 
	public CompItem next() {
		return items.get(position++);
	}
 
	public boolean hasNext() {
		return items.size() > position;
	}
}
