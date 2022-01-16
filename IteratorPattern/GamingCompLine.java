import java.util.ArrayList;

public class GamingCompLine implements Comp {

	ArrayList<CompItem> compItems;

	public GamingCompLine()
	{
		compItems = new ArrayList<CompItem>();

		AddItem("Putting high-end multi-core cpu","Putting high clock speed memory","Putting ssd storage");

		AddItem("Gaming cpu2", "Gaming memory2", "Gaming storage2");
		AddItem("Gaming cpu3", "Gaming memory3", "Gaming storage3");
		AddItem("Gaming cpu4", "Gaming memory4", "Gaming storage4");
	}

	public void AddItem(String cpu, String memory, String storage)
	{
		CompItem compItem = new CompItem(cpu,memory,storage);
		compItems.add(compItem);
	}

	public ArrayList<CompItem> getCompItem()
	{
		return compItems;
	}
  
	public Iterator createIterator() {
		return new GamingCompIterator(compItems);
	}
  

}
