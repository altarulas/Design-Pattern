public class ClickySwitch extends Switch implements SwitchComponentFactory{


    public ClickySwitch(SwitchComponentFactory cherrySwitchComponent) {
        super();
    }

    @Override
    void gatherParts() {

    }

    @Override
    public KeyCap createKeyCap() {
        return null;
    }

    @Override
    public Stem createStem() {
        return null;
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        return null;
    }
}
