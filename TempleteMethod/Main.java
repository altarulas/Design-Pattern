public class Main {

    public static void main(String[] args) {

        GamingComp gamingComp = new GamingComp();
        OfficeComp officeComp = new OfficeComp();

        System.out.println("****Making Gaming Computer****\n");
        gamingComp.puttingItems();
        gamingComp.peripherals();

        System.out.println();

        System.out.println("****Making Office Computer****\n");
        officeComp.puttingItems();
        officeComp.peripherals();

    }

}
