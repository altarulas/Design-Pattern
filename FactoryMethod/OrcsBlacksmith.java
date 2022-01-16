public class OrcsBlacksmith extends WeaponStore{

    @Override
    Weapon createWeapon(String type) {

        if(type.equals("Axe"))
            return new Axe();

        else if(type.equals("Hammer"))
            return new Hammer();

        else
            return null;

    }

}
