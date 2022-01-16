public class HeroContext {

    State alive;
    State dead;
    State invisible;
    State silenced;

    State state;

    int hp = 0;
    int damage = 0;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public HeroContext(int hp)
    {
        alive = new AliveState(this);
        dead = new DeadState(this);
        invisible = new InvisibleState(this);
        silenced = new SilencedState(this);

        this.hp = hp;

        if(hp > 0)
            state = alive;
        else
            state = dead;


    }

    public void HeroScreenCheck()
    {
        System.out.println();
        System.out.println("Hero Context");
        System.out.println("============");
        System.out.println("Hero HP " + getHp());
        System.out.println("Hero is " + state.getClass().getName() + "\n");
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    int getHp()
    {
        return hp;
    }

    public State getState() {
        return state;
    }

    void setState(State state)
    {
        this.state = state;
    }

    public void attack()
    {
        state.attack();
    }

    public void attacked()
    {
        state.attacked();
        if(getHp() == 10)
        {
            setHp(5);
            setDamage(5);
            System.out.println("...Hero is being attacked with damage: " + getDamage());
        }


    }

    public void attacked2()
    {
        state.attacked2();
        setHp(0);
        setDamage(10);
        System.out.println("...Hero is being attacked with damage: " + getDamage());

    }

    public void silenced()
    {
        state.silenced();

    }

    public void disappear()
    {
        state.disappear();
    }

    public void revived()
    {
        state.revived();
        if(getHp() == 0)
            setHp(10);

    }

    public void recovered()
    {
        state.recovered();
    }

    public void visible()
    {
        state.visible();
    }


    public State getAlive() {
        return alive;
    }

    public State getDead() {
        return dead;
    }

    public State getInvisible() {
        return invisible;
    }

    public State getSilenced() {
        return silenced;
    }


}
