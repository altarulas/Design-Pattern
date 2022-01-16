public class ThreadSafe extends Coin {

    private static ThreadSafe instance;

    private ThreadSafe(){};

    public static synchronized ThreadSafe getInstance()
    {
        if(instance == null)
            instance = new ThreadSafe();

        return instance;
    }

}
