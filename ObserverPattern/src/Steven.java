public class Steven implements Observer {

    private String tweet;
    private Subject karsu;

    public Steven(Subject karsu)
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
        System.out.println("Steven has received Karsu Donmez's tweet  ::  " + tweet);
    }

}
