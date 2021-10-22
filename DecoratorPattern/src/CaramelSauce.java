public class CaramelSauce extends WaffleDecorator{

    Waffle waffle;

    public CaramelSauce(Waffle waffle)
    {
        this.waffle = waffle;
    }


    @Override
    public String getDescription() {
        return waffle.getDescription() + " Caramel Sauce, ";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice() + 1.0;
    }

}
