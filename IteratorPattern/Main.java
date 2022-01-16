public class Main
{
	public static void main(String args[]) {
		Comp gamingCompLine = new GamingCompLine();
		Comp officeCompLine = new OfficeCompLine();

		CompLine compLine = new CompLine(gamingCompLine, officeCompLine);

		compLine.buildComp();

	}

}
