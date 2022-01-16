public class DeadState implements State{
    HeroContext heroContext;

    public DeadState(HeroContext heroContext)
    {
        this.heroContext = heroContext;
    }

    @Override
    public void attack() {
        System.out.println("...Hero is dead, and cannot be attack others");
    }

    @Override
    public void attacked() {
        System.out.println("...Hero is dead, and cannot be attacked");
    }

    @Override
    public void attacked2() {

    }

    @Override
    public void silenced() {
        System.out.println("...Hero is dead, and cannot be silenced");
    }

    @Override
    public void disappear() {
        System.out.println("...Hero is dead, and cannot disappear");
    }

    @Override
    public void revived() {
        System.out.println("...Hero is being revived");
        heroContext.setState(heroContext.getAlive());
    }

    @Override
    public void recovered() {
        System.out.println("...Hero is dead, and cannot be recovered");
    }

    @Override
    public void visible() {
        System.out.println("...Hero is dead, and cannot appear");
    }


}
