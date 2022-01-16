public abstract class CoilSpring {

    int pressureCN;

    public CoilSpring(int pressureCN) {
        this.pressureCN = pressureCN;
    }

    @Override
    public String toString() {
        return "CoilSpring{" +
                "pressureCN=" + pressureCN +
                '}';
    }
}
