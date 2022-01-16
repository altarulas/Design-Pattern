public class LinearSwitch extends Switch {


    SwitchComponentFactory cherrySwitchComponent;
    PressureCN pressureCN;

    public LinearSwitch(SwitchComponentFactory cherrySwitchComponent) {
        this.cherrySwitchComponent = cherrySwitchComponent;
    }

    @Override
    void gatherParts() {

        placeCoilSpring();
        placeStem();
        placeKeyCap();

        keyCap = cherrySwitchComponent.createKeyCap();
        stem = cherrySwitchComponent.createStem();
        coilSpring = cherrySwitchComponent.createCoilSpring(pressureCN);

    }



}
