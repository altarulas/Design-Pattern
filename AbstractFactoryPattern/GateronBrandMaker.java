public class GateronBrandMaker extends SwitchMaker{

    @Override
    Switch createSwitch(String type) {

        Switch gateronMaker = createSwitch(type);
        return gateronMaker;
    }

    @Override
    Switch assembleSwitch(String type) {

        Switch gateronSwitch = null;
        SwitchComponentFactory gateronSwitchComponent = new CherryMXSwitchComponentFactory();

        if(type.equals("linear"))
        {
            gateronSwitch = new LinearSwitch(gateronSwitchComponent);
        }

        if(type.equals("tactile"))
        {
            gateronSwitch = new TactileSwitch(gateronSwitchComponent);
        }

        if(type.equals("clicky"))
        {
            gateronSwitch = new ClickySwitch(gateronSwitchComponent);
        }

        return gateronSwitch;
    }

}
