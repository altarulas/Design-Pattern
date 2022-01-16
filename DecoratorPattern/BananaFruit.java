public class BananaFruit extends WaffleDecorator{

    Waffle waffle;

    public BananaFruit(Waffle waffle)
    {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + " Banana, ";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice() + 0.5;
    }

}
