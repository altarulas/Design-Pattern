public class Main {

    public static void main(String[] args) {

        Turner turner = new Turner(
                "Turning", "LivingRoomFan ", "İncrease Speed Of ", 2," LivingRoomLight",
                " LivingRoomTV"," LivingRoomFireTV4KStick", " LivingRoomSoundBar",
                "KitchenLight","Microwave", "ElectricGrill","CoffeeMaker","Turning Off ");
        Setting setting = new Setting("Setting ","HDMI ARC "," LivingRoomTV", " Dolby Atmos",
                20,"LivingRoomSoundBar","Refrigerator", "Party","Microwave",200,5,
                100," LivingRoomLight","Normal");
        Opener opener = new Opener("Opening","LivingRoomFireTV4KStick"," Netflix");
        Dimming dimming = new Dimming("Dimming ","LivingRoomLight");
        Player player = new Player(" Playing", "Spider-Man: Far From Home","Netflix");
        Baker baker = new Baker("Baking", " Napoletana Pizza", " Margherita Pizza"," Mariana Pizza",
                "Microwave"," Chicago-Style Deep Dish Pizza",400,10);
        Closer closer = new Closer("Closing ","Netflix ","LivingRoomFireTV4KStick");

        WeekendHousePartyOperations weekendHousePartyOperations = new WeekendHousePartyOperations(turner, setting,opener,
                dimming, player,baker,closer);


        System.out.println("---------------------");
        weekendHousePartyOperations.MovieStarting();
        System.out.println("---------------------");
        weekendHousePartyOperations.PreparingFood();
        System.out.println("---------------------");
        weekendHousePartyOperations.StoppingMovie();
        System.out.println("---------------------");
        weekendHousePartyOperations.closeKitchen();


    }

}
