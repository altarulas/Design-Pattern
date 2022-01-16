public class Closer {

    String description;
    String platform;
    String stick;

    public Closer(String description, String platform, String stick)
    {
        this.description = description;
        this.platform = platform;
        this.stick = stick;
    }

    public void closePlatform()
    {
        System.out.println(description + platform + "on " + stick);
    }
}
