public class ElvesBlacksmith extends WeaponStore{

    @Override
    Weapon createWeapon(String item) {

        if(item.equals("Spear"))
            return new Spear();

        else if(item.equals("Short Sword"))
            return new ShortSword();

        else
            return null;

    }

}
