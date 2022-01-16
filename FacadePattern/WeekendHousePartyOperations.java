public class WeekendHousePartyOperations {

    Turner turner;
    Setting setting;
    Opener opener;
    Dimming dimming;
    Player player;
    Baker baker;
    Closer closer;
    String tool;

    public WeekendHousePartyOperations(Turner turner, Setting setting,Opener opener, Dimming dimming, Player player, Baker baker,
                                       Closer closer)
    {
        this.turner = turner;
        this.setting = setting;
        this.opener = opener;
        this.dimming = dimming;
        this.player = player;
        this.baker = baker;
        this.closer = closer;
    }


    public void MovieStarting()
    {
        System.out.println("Setting up movie...");
        turner.on();
        turner.incMethod();
        turner.turnLight();
        turner.turnTV();
        setting.source();
        turner.stick4K();
        turner.sound();
        setting.sound();
        opener.stick();
        dimming.light();
        setting.setVolume();
        player.playing();

    }

    public void PreparingFood()
    {
        System.out.println("Preparing Food...");
        turner.onKitchen();
        setting.setkitchenTool();
        turner.kitchenTool1();
        setting.MicrowaveSetter();
        turner.kitchenTool1Grill();
        turner.kitchenTool2();
        turner.kitchenTool3();
        baker.napPizza();
        baker.margheritaPizza();
        baker.marPizza();
        System.out.println("---------------------");
        System.out.println("Enjoy Movie with Meal and Drink...");
        System.out.println("Movie Completed");

    }

    public void StoppingMovie()
    {
        System.out.println("Stopping Movie...");
        closer.closePlatform();
        turner.offStick();
        turner.offSoundBar();
        turner.offTv();
        setting.brightLevel();
        turner.offFan();

    }

    public void closeKitchen()
    {
        System.out.println("Closing Kitchen...");
        setting.setsetkitchenTool2();
        turner.offTool2();
        turner.offTool3();
        turner.offTool1();
    }


}
