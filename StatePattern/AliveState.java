public class AliveState implements State{
    HeroContext heroContext;

    public AliveState(HeroContext heroContext)
    {
        this.heroContext = heroContext;
    }

    @Override
    public void attack() {
        System.out.println("...Hero is attacking others");
    }

    @Override
    public void attacked() {
        System.out.println();
    }

    @Override
    public void silenced() {
        System.out.println("...Hero is being silenced");
        heroContext.setState(heroContext.getSilenced());
    }

    @Override
    public void disappear() {
        System.out.println("...Hero disappears");
        heroContext.setState(heroContext.getInvisible());
    }

    @Override
    public void revived() {
        System.out.println("...Hero is already alive, and cannot be revived");
    }

    @Override
    public void recovered() {
        System.out.println("...Hero is already recovered, and cannot be recovered");
    }

    @Override
    public void visible() {
        System.out.println("...Hero is already visible, and cannot appear");
    }

    public void attacked2() {
        heroContext.setState(heroContext.getDead());
    }

}
