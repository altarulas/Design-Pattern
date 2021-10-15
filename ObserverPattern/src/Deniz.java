public class Deniz implements Observer {

    private String tweet;
    private Subject karsu;

    public Deniz(Subject karsu)
    {
        this.karsu = karsu;
        karsu.follow(this);
    }

    @Override
    public void update(String tweet) {
        this.tweet = tweet;
        display();
    }

    public void display()
    {
        System.out.println("Deniz has received Karsu Donmez's tweet  ::  " + tweet);
    }


}
