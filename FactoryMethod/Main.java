public class Main {

    public static void main(String[] args)
    {
        WeaponStore weaponStore1 = new ElvesBlacksmith();
        WeaponStore weaponStore2 = new OrcsBlacksmith();

        Weapon weapon;

        weapon = weaponStore1.createWeapon("Spear");
        System.out.println("Elves Ordered   ==>  " + weapon.weapon());

        weapon = weaponStore1.createWeapon("Short Sword");
        System.out.println("Elves Ordered   ==>  " + weapon.weapon());

        weapon = weaponStore2.createWeapon("Axe");
        System.out.println("Orcs Ordered  ==>  " + weapon.weapon());

        weapon = weaponStore2.createWeapon("Hammer");
        System.out.println("Orcs Ordered  ==>  " + weapon.weapon());


    }
}
