public class HazelNut extends WaffleDecorator{

    Waffle waffle;

    public HazelNut(Waffle waffle)
    {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + " Hazelnut, ";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice() + 1.0;
    }

}
