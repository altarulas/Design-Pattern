public abstract class CompBuilder {

    final void puttingItems()
    {
        cpu();
        memory();
        storage();
    }

    abstract void cpu();
    abstract void memory();
    abstract void storage();

    void peripherals()
    {
        System.out.println("Connecting mouse, keyboard, monitor");
    }

}
