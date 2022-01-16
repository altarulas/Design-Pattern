public class Main {

    public static void main(String[] args)
    {
        KarsuDonmez karsuDonmez = new KarsuDonmez();
        FeritOdman feritOdman = new FeritOdman();

        Deniz deniz = new Deniz(karsuDonmez);
        Robert robert = new Robert(karsuDonmez);
        Steven steven = new Steven(karsuDonmez);

        Jeff jeff = new Jeff(feritOdman);
        Sandra sandra = new Sandra(feritOdman);
        Olivia olivia = new Olivia(feritOdman);

        System.out.println();

        karsuDonmez.setTweet1(":) Which artist will be guests in my room?\n" +
                "Sometimes I will sing song with their valuable guests and sometimes I will give my guests pleasant moments" +
                " with the little games I have prepared!");

        System.out.println();

        feritOdman.setTweet2("It rarely happens to me, but I was hittin' it hard tonight. !!");

        System.out.println();

        feritOdman.unfollow(jeff);

        karsuDonmez.setTweet1("WHAA I am the new FOOD COLUMNIST of @andcgram Magazine! Thank you @chantaljanzen!!" +
                " I am sooo soo sooo HAPPY! my first dish is #Ceviche..!!");


    }
}
