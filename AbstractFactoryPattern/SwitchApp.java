public class SwitchApp {

    public static void main(String[] args) {

        SwitchMaker cherryMXMaker = new CherryMXBrandMaker();
        Switch cherryMXLinearSwitch = cherryMXMaker.assembleSwitch("linear");

        System.out.println(cherryMXLinearSwitch);

    }

}
