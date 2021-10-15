public class Olivia implements Observer {

    private String tweet;
    private Subject ferit;

    public Olivia(Subject ferit)
    {
        this.ferit = ferit;
        ferit.follow(this);
    }

    @Override
    public void update(String tweet) {
        this.tweet = tweet;
        display();
    }

    public void display()
    {
        System.out.println("Olivia has received Ferit Odman's tweet  ::  " + tweet);
    }

}
