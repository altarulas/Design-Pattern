public class OfficeComp extends CompBuilder{

    @Override
    void cpu() {
        System.out.println("Putting low-end dual core cpu");
    }

    @Override
    void memory() {
        System.out.println("Putting energy efficient memory");
    }

    @Override
    void storage() {
        System.out.println("Putting energy efficient HDD");
    }

}
