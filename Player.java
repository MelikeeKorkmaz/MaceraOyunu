import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Player {
    private GameChar gameChar;
    private Location loc;
    private Inventory inventory;
    private String charName;
    private String name;
    private int health;
    private int damage;
    private int money;
    Scanner input = new Scanner(System.in);

    Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameChar[] chars = {new Samurai(), new Archer(), new Knight()};

        System.out.println("================================================\nOYUN KARAKTERLERİ");
        charList(chars);
        System.out.println("================================================");

        System.out.print("Seçtiğiniz karakterin ID'sini girin: ");
        int select = input.nextInt();
        if (select <= chars.length && select > 0) {
            this.gameChar = chars[select - 1];
            setProperties(this.gameChar);
        } else {
            System.out.println("Yanlış ID girişi yaptınız. Sistem otomatik olarak Samuray karakteri seçmiştir.");
            setProperties(new Samurai());
        }
        printInfo();
    }

    public void selectLoc(Location[] locations) {
        while (loc.onLocation()) {
            System.out.println("\n========================");
            System.out.println("Harita yükleniyor...");
            //Gidilebilecek yerler listelenip yazdırılabilir mi ?
            System.out.println("Güvenli Bölgeler----> Bu alanlarda düşman yok" +
                    "\n\t1- Güvenli ev - Sağlığınız yenilenir.\n\t2- Mağaza - Yeni teçhizatlar alabilirsiniz.");
            System.out.println("Savaş Bölgeleri----> Düşmanlarla savaşıp item ve para kazanabilirsiniz." +
                    "\n\t3- Orman - Vampir bölgesi.\n\t4- Nehir - Ayı bölgesi.\n\t5- Mağara - Zombi bölgesi");

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
        if (!loc.onLocation()) {
            System.out.println("GAME OVER");
        }
    }

    public void charList(GameChar[] c) {
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
                "\tArmor: " + this.inventory.getArmor().getName() +
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
