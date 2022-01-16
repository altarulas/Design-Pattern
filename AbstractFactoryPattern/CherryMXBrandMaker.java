public class CherryMXBrandMaker extends SwitchMaker{

    @Override
    Switch createSwitch(String type) {

        Switch cherryMaker = assembleSwitch(type);
        return cherryMaker;
    }

    @Override
    Switch assembleSwitch(String type) {

        Switch cherrySwitch = null;
        SwitchComponentFactory cherrySwitchComponent = new CherryMXSwitchComponentFactory();

        if(type.equals("linear"))
        {
            cherrySwitch = new LinearSwitch(cherrySwitchComponent);
        }

        if(type.equals("tactile"))
        {
            cherrySwitch = new TactileSwitch(cherrySwitchComponent);
        }

        if(type.equals("clicky"))
        {
            cherrySwitch = new ClickySwitch(cherrySwitchComponent);
        }

        return cherrySwitch;
    }

}
