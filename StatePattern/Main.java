public class Main {

    public static void main(String[] args)
    {

        HeroContext heroContext = new HeroContext(10);

        heroContext.HeroScreenCheck();
        heroContext.attacked();
        heroContext.HeroScreenCheck();

        heroContext.attack();
        heroContext.HeroScreenCheck();

        heroContext.visible();
        heroContext.recovered();
        heroContext.revived();
        heroContext.disappear();
        heroContext.HeroScreenCheck();

        heroContext.disappear();
        heroContext.attacked();
        heroContext.silenced();
        heroContext.recovered();
        heroContext.revived();
        heroContext.attack();
        heroContext.HeroScreenCheck();

        heroContext.visible();
        System.out.println();
        heroContext.HeroScreenCheck();

        heroContext.attacked2();
        heroContext.HeroScreenCheck();

        heroContext.visible();
        heroContext.disappear();
        heroContext.attack();
        heroContext.attacked();
        heroContext.recovered();
        heroContext.silenced();
        heroContext.revived();
        heroContext.HeroScreenCheck();

        heroContext.silenced();
        heroContext.HeroScreenCheck();

        heroContext.visible();
        heroContext.attack();
        heroContext.silenced();
        heroContext.revived();
        heroContext.disappear();
        heroContext.HeroScreenCheck();

        heroContext.visible();
        heroContext.attacked();
        heroContext.HeroScreenCheck();

        heroContext.recovered();
        heroContext.HeroScreenCheck();

        heroContext.silenced();
        heroContext.attacked2();
        heroContext.HeroScreenCheck();

        heroContext.revived();
        heroContext.HeroScreenCheck();


    }

}
