package Abstracts;

public abstract class GameChar {
    private String charName;
    private int id;
    private int health;
    private int damage;
    private int money;

    public GameChar(String charName, int id, int health, int damage, int money) {
        this.charName = charName;
        this.id = id;
        this.health = health;
        this.damage = damage;
        this.money = money;
    }

    public void printCharInfo() {
        System.out.println("ID: " + this.id + "\tKarakter: " + this.charName + "\tSağlık: " + this.health + "\tHasar: " + this.damage + "\tPara: " + this.money);
    }

    public String getCharName() {
        return this.charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}