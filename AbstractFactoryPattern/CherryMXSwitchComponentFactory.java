public class CherryMXSwitchComponentFactory implements SwitchComponentFactory{

    @Override
    public KeyCap createKeyCap() {
        return new GateronKeyCap();
    }

    @Override
    public Stem createStem() {
        return new CherryMXStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        return new CherryMXCoilSpring(45);
    }

}
