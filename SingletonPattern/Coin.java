public class Coin {

    private int coinCount;

    public int getCoinCount() {
        return coinCount;
    }

    public void setCoinCount(int coinCount) {
        this.coinCount = coinCount;
    }

    public void addCoin()
    {
        setCoinCount(10);
    }

    public void reduceCoin()
    {
        setCoinCount(9);
    }

}
