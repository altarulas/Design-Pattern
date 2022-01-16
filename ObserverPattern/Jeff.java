public class Jeff implements Observer {

    private String tweet;
    private Subject ferit;

    public Jeff(Subject ferit)
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
        System.out.println("Jeff has received Ferit Odman's tweet  ::  " + tweet);
    }

}
