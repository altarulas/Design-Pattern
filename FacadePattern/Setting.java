public class Setting {

    String description;
    String type;
    String tv;
    String sound;
    String soundBar;
    String tool1,tool2;
    String mode;
    int temp;
    int volume;
    int time;
    int brightness;
    String light;
    String mode2;

    public Setting(String description, String tv, String type, String sound, int volume, String soundBar, String tool1,
                   String mode, String tool2, int temp, int time, int brightness, String light, String mode2)
    {
        this.description = description;
        this.tv = tv;
        this.type = type;
        this.sound = sound;
        this.volume = volume;
        this.soundBar = soundBar;
        this.tool1 = tool1;
        this.mode = mode;
        this.tool2 = tool2;
        this.temp = temp;
        this.time = time;
        this.brightness = brightness;
        this.light = light;
        this.mode2 = mode2;
    }

    public void source()
    {
        System.out.println(description + "Source of " + tv + "to" + type);
    }

    public void sound()
    {
        System.out.println(description + "Sound-Mode of" + soundBar + sound);
    }

    public void setVolume()
    {
        System.out.println(description + " volume of " + soundBar + " to " + volume);
    }

    public void setkitchenTool()
    {
        System.out.println(description + tool1 + " Cooling to " + mode);
    }

    public void MicrowaveSetter()
    {
        System.out.println(description + tool2 + " on Pre-Heat, temprature " + temp + " , time " + time + " minutes");
    }

    public void brightLevel()
    {
        System.out.println(description + " brightness of " + light + " to "+ brightness);
    }

    public void setsetkitchenTool2()
    {
        System.out.println(description + tool1 + " Cooling to " + mode2);
    }
}
