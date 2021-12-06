public class GamingComp extends CompBuilder{

    @Override
    void cpu() {
        System.out.println("Putting high-end multi-core cpu");
    }

    @Override
    void memory() {
        System.out.println("Putting high clock speed memory");
    }

    @Override
    void storage() {
        System.out.println("Putting ssd storage");
    }
}
