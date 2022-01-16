public class Player {

    String description;
    String movieName;
    String platform;

    public Player(String description, String movieName, String platform)
    {
        this.description = description;
        this.movieName = movieName;
        this.platform = platform;
    }

    public void playing()
    {
        System.out.println(description + movieName + " on " + platform);
    }
}
