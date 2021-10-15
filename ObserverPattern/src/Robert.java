public class Robert implements Observer {

    private String tweet;
    private Subject karsu;

    public Robert(Subject karsu)
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
        System.out.println("Robert has received Karsu Donmez's tweet  ::  " + tweet);
    }


}
