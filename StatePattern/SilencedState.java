public class SilencedState implements State{
    HeroContext heroContext;

    public SilencedState(HeroContext heroContext)
    {
        this.heroContext = heroContext;
    }

    @Override
    public void attack() {
        System.out.println("...Hero is silenced and cannot attack others");
    }

    @Override
    public void attacked() {

    }

    @Override
    public void attacked2() {
        heroContext.setState(heroContext.getDead());
    }

    @Override
    public void silenced() {
        System.out.println("...Hero is already silenced and cannot silence again");
    }

    @Override
    public void disappear() {
        System.out.println("...Hero disappears");
        heroContext.setState(heroContext.getInvisible());
    }

    @Override
    public void revived() {
        System.out.println("...Hero is already silenced, and cannot be revived");
    }

    @Override
    public void recovered() {

    }

    @Override
    public void visible() {
        System.out.println("...Hero is already visible, and cannot appear");
    }

}
