public class Dimming {

    String description;
    String light;

    public Dimming(String description, String light)
    {
        this.description = description;
        this.light = light;
    }

    public void light()
    {
        System.out.println(description + light);
    }
}
