import java.util.ArrayList;

public class KarsuDonmez implements Subject{

    private ArrayList<Observer> observers1;
    private String tweet1;

    public KarsuDonmez()
    {
        observers1 = new ArrayList<Observer>();
    }

    public String getTweet1() {
        return tweet1;
    }

    public void setTweet1(String tweet1) {
        this.tweet1 = tweet1;
        System.out.println("Karsu Donmez has tweeted  ::  " + tweet1 + "\n");
        notifyObservers();
    }

    @Override
    public void follow(Observer o) {
        observers1.add(o);
        System.out.println(o.getClass().getName() + " has started to following Karsu Donmez");
    }

    @Override
    public void unfollow(Observer o) {
        int i = observers1.indexOf(o);
        if(i >= 0)
        {
            observers1.remove(i);
            System.out.println(o.getClass().getName()  + " has stopped following Karsu Donmez" + "\n");
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers1)
            observer.update(tweet1);
    }


}
