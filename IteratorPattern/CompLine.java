public class CompLine {
	Comp GamingCompLine;
	Comp OfficeCompLine;
 
	public CompLine(Comp GamingCompLine, Comp OfficeCompLine) {
		this.GamingCompLine = GamingCompLine;
		this.OfficeCompLine = OfficeCompLine;
	}
 
	public void buildComp() {
		Iterator gamingCompLineIterator = GamingCompLine.createIterator();
		Iterator officeCompLineIterator = OfficeCompLine.createIterator();

		System.out.println("Gaming Comp Line");
		System.out.println();
		build(gamingCompLineIterator);
		System.out.println();
		System.out.println("Office Comp Line");
		System.out.println();
		build(officeCompLineIterator);

	}

	private void build(Iterator iterator) {

		while (iterator.hasNext()) {

			CompItem compItem = iterator.next();
			System.out.print(compItem.getCpu() + ", ");
			System.out.print(compItem.getMemory() + " -- ");
			System.out.println(compItem.getStorage());

		}
	}


}
