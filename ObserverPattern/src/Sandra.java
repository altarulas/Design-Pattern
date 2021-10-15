public class Sandra implements Observer {

    private String tweet;
    private Subject ferit;

    public Sandra(Subject ferit)
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
        System.out.println("Sandra has received Ferit Odman's tweet  ::  " + tweet);
    }

}
