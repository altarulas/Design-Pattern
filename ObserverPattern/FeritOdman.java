import java.util.ArrayList;

public class FeritOdman implements Subject {

    private ArrayList<Observer> observers2;
    private String tweet2;

    public FeritOdman()
    {
        observers2 = new ArrayList<Observer>();
    }

    public String getTweet2() {
        return tweet2;
    }

    public void setTweet2(String tweet2) {
        this.tweet2 = tweet2;
        System.out.println("Ferit Odman has tweeted  ::  " + tweet2 + "\n");
        notifyObservers();
    }


    @Override
    public void follow(Observer o) {
        observers2.add(o);
        System.out.println(o.getClass().getName()  + " has started to following Ferit Odman");
    }

    @Override
    public void unfollow(Observer o) {
        int i = observers2.indexOf(o);
        if(i >= 0)
        {
            observers2.remove(i);
            System.out.println(o.getClass().getName()  + " has stopped following Ferit Odman" + "\n");
        }

    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers2)
            observer.update(tweet2);
    }

}
