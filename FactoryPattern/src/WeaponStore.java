public abstract class WeaponStore {

    abstract Weapon createWeapon(String item);

    public Weapon orderWeapon(String type)
    {
        Weapon newWeapon = createWeapon(type);
        newWeapon.weapon();
        return newWeapon;
    }


}
