public class OfficeCompLine implements Comp {

	static final int MAX_ITEMS = 5;
	int numberOfItems = 0;
	CompItem[] compItems;

	public OfficeCompLine() {
		compItems = new CompItem[MAX_ITEMS];

		addItem("Putting low-end dual core cpu","Putting energy efficient memory","Putting energy efficient HDD");
		addItem("office cpu2","office memory2", "office storage2");
		addItem("office cpu3","office memory3", "office storage3");
		addItem("office cpu4","office memory4", "office storage4");
	}

	public void addItem(String cpu, String memory,String storage)
	{
		CompItem compItem = new CompItem(cpu, memory,storage);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Error size is full");
		} else {
			compItems[numberOfItems] = compItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public CompItem[] getCompItems() {
		return compItems;
	}
  
	public Iterator createIterator() {
		return new OfficeCompIterator(compItems);
	}

}
