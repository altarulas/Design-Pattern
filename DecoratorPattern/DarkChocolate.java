public class DarkChocolate extends WaffleDecorator{

    Waffle waffle;

    public DarkChocolate(Waffle waffle)
    {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + " Dark Chocolate, ";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice() + 2.0;
    }
}
