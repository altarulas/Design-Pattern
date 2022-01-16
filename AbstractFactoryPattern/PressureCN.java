public enum PressureCN {

    Light(45),
    Medium(55),
    Heavy(60),
    SuperHeavy(80);

    public int cn = 45;

    PressureCN(int cn) {
        this.cn = cn;
        System.out.println(cn);
    }
}
