public class Inventory {
    Weapon weapon;
    Armor armor;
    private boolean food;
    private boolean water;
    private boolean firewood;

    Inventory() {
        this.weapon = new Weapon(0, "Yumruk", 0, 0);
        this.armor = new Armor(0, "Kıyafet", 0, 0);
        this.food = false;
        this.water = false;
        this.firewood = false;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }
}
