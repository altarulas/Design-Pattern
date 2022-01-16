public class Opener {

    String description;
    String stick;
    String platform;

    public Opener(String description, String stick, String platform)
    {
        this.description = description;
        this.stick = stick;
        this.platform = platform;
    }

    public void stick()
    {
        System.out.println(description + platform + " on " + stick);
    }
}
