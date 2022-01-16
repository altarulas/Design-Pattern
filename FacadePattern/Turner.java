public class Turner {

    String description;
    String description2;
    String room;
    String increase;
    String turnRoomLight;
    String tv;
    String stick;
    String soundBar;
    String kitchenLight;
    String tool1,tool2,tool3;
    int inc;

    public Turner(String description, String room , String increase, int inc, String turnRoomLight, String tv, String stick,
                  String soundBar, String kitchenLight, String tool1, String tool2, String tool3, String description2) {
        this.description = description;
        this.room = room;
        this.increase = increase;
        this.inc = inc;
        this.turnRoomLight = turnRoomLight;
        this.tv = tv;
        this.stick = stick;
        this.soundBar = soundBar;
        this.kitchenLight = kitchenLight;
        this.tool1 = tool1;
        this.tool2 = tool2;
        this.tool3 = tool3;
        this.description2 = description2;
    }

    public void on() {
        System.out.println(description + " on " + room);
    }

    public void incMethod()
    {
        System.out.println(increase + room + "to " + inc);
    }

    public void turnLight()
    {
        System.out.println(description + " on" + turnRoomLight);
    }

    public void turnTV()
    {
        System.out.println(description + " on" + tv);
    }

    public void stick4K()
    {
        System.out.println(description + " on" + stick);
    }

    public void sound()
    {
        System.out.println(description + " on" + soundBar);
    }

    public void onKitchen()
    {
        System.out.println(description + " on " + kitchenLight);
    }

    public void kitchenTool1()
    {
        System.out.println(description + " on " + tool1);
    }

    public void kitchenTool1Grill()
    {
        System.out.println(description + " on grill of" + tool1);
    }

    public void kitchenTool2()
    {
        System.out.println(description + " on " + tool2);
    }

    public void kitchenTool3()
    {
        System.out.println(description + " on " + tool3);
    }

    public void offStick()
    {
        System.out.println(description2 + stick);
    }

    public void offSoundBar()
    {
        System.out.println(description2 + soundBar);
    }

    public void offTv()
    {
        System.out.println(description2 + tv);
    }

    public void offFan()
    {
        System.out.println(description2 + room);
    }

    public void offTool1()
    {
        System.out.println(description2 + tool1);
    }

    public void offTool2()
    {
        System.out.println(description2 + tool2);
    }

    public void offTool3()
    {
        System.out.println(description2 + tool3);
    }

    public String toString() {
        return description;
    }
}
