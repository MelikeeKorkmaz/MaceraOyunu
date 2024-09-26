public class Inventory {
    boolean water;
    boolean food;
    boolean firewood;
    String weaponName;
    int weaponDamage;
    int armorDefence;

    Inventory(String weaponName, int weaponDamage, int armorDefence){
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.armorDefence = armorDefence;
    }
}
