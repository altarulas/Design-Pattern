public class Eager extends Coin {

    private static Eager instance = new Eager();

    private Eager() {};

    public static Eager getInstance()
    {
        return instance;
    }


}
