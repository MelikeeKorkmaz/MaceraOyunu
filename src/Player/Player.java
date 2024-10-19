package Player;

import Abstracts.GameChar;
import Abstracts.Location;
import Characters.Samurai;

import java.util.Scanner;

public class Player {
    private GameChar gameChar;
    private Location loc;
    private Inventory inventory;
    private String name;
    private String charName;
    private int health;
    private int damage;
    private int money;
    Scanner input = new Scanner(System.in);

    public Player() {
        this.inventory = new Inventory();
    }

    public void selectChar(GameChar[] list) {
        System.out.println("================================================\nOYUN KARAKTERLERİ");
        printCharList(list);
        System.out.println("================================================");

        System.out.print("Seçtiğiniz karakterin ID'sini girin: ");
        int select = input.nextInt();
        if (select <= list.length && select > 0) {
            this.gameChar = list[select - 1];
            setProperties(this.gameChar);
        } else {
            System.out.println("Yanlış ID girişi yaptınız. Sistem otomatik olarak Samuray karakteri seçmiştir.");
            setProperties(new Samurai());
        }
        printInfo();
    }

    public void selectLoc(Location[] locations) {
        while (loc.onLocation()) {
            printMap(locations);
            System.out.print("Gitmek istediğiniz bölgenin numarasını girin: ");
            int area = input.nextInt();
            if (area <= locations.length && area > 0) {
                this.loc = locations[area - 1];
            } else {
                System.out.println("Girdiğiniz bölge numarası yanlış. Güvenli eve yönlendiriliyorsunuz.");
                this.loc = locations[0];
            }
            System.out.println("========================");
        }
    }

    public void printMap(Location[] locations) {
        System.out.println("\n========================");
        System.out.println("Harita yükleniyor...");
        for (int i = 0; i < locations.length; i++) {
            System.out.println(i + 1 + "- " + locations[i].getLocName());
        }
    }

    public void printCharList(GameChar[] c) {
        for (GameChar i : c) {
            i.printCharInfo();
        }
    }

    public void setProperties(GameChar c) {
        this.charName = c.getCharName();
        this.money = c.getMoney();
        this.damage = c.getDamage();
        this.health = c.getHealth();
    }

    public void printInfo() {
        System.out.println("Oyuncu: " + this.name +
                "\tKarakter: " + this.charName +
                "\tSağlık: " + this.health +
                "\tHasar: " + this.damage +
                "\tSilah: " + this.inventory.getWeapon().getName() +
                "\tLocations.Stores.Armor: " + this.inventory.getArmor().getName() +
                "\tLocations.Stores.Armor Koruması: " + this.inventory.getArmor().getProtection() +
                "\tPara: " + this.money);
    }

    public GameChar getGameChar() {
        return gameChar;
    }

    public void setGameChar(GameChar gameChar) {
        this.gameChar = gameChar;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}