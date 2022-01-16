public class Main {

    public static void main(String[] args) {

        Coin coin1 = Eager.getInstance();
        Coin coin2 = Lazy.getInstance();

        coin1.addCoin();
        coin2.addCoin();

        System.out.println("coin1.getCoinCount() = " +coin1.getCoinCount());
        System.out.println("coin2.getCoinCount() = " + coin2.getCoinCount());

        System.out.println();

        coin1.reduceCoin();
        coin2.reduceCoin();

        System.out.println("coin1.getCoinCount() = " + coin1.getCoinCount());
        System.out.println("coin2.getCoinCount() = " + coin2.getCoinCount());
        System.out.println();

        System.out.println("coin1 = " + coin1.toString());
        System.out.println("coin2 = " + coin2.toString());


    }
}
