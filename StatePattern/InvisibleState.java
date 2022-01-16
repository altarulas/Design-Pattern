public class InvisibleState implements State{
    HeroContext heroContext;

    public InvisibleState(HeroContext heroContext)
    {
        this.heroContext = heroContext;
    }

    @Override
    public void attack() {
        System.out.println("...Hero is attacking others");
    }

    @Override
    public void attacked() {
        System.out.println("...Hero is already invisible and cannot be attacked");
    }

    @Override
    public void attacked2() {

    }

    @Override
    public void silenced() {
        System.out.println("...Hero is invisible and cannot be silenced");
    }

    @Override
    public void disappear() {
        System.out.println("...Hero is already invisible, and cannot disappear");
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
        System.out.print("...Hero appears");
        heroContext.setState(heroContext.getAlive());
    }


}
