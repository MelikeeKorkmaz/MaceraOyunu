import java.util.Scanner;
public class Player {
    GameChar gameChar;
    String charName;
    String name;
    private int health;
    private int damage;
    private int money;
    Scanner input = new Scanner(System.in);

    Player(String name) {
        this.name = name;
    }

    public void selectChar(){
        //If you want to create a new character, create a new object and add it to the chars list.
        GameChar samurai = new GameChar("Samuray", 0, 21, 5, 15);
        GameChar archer = new GameChar("Okçu", 1, 18, 7, 20);
        GameChar knight = new GameChar("Şovalye", 2, 24, 8, 5);
        GameChar[] chars = {samurai, archer, knight};

        System.out.println("-----------------\nOYUN KARAKTERLERİ");
        charList(chars);
        System.out.println("-----------------");

        System.out.print("Seçtiğiniz karakterin ID'sini girin: ");
        int select = input.nextInt();
        if(select < chars.length && select >= 0) {
            this.gameChar = chars[select];
            setProperties(this.gameChar);
        }else{
            System.out.println("Yanlış ID girişi yaptınız. Sistem otomatik olarak Samuray karakteri seçmiştir.");
            setProperties(samurai);
        }
        printInfo();
    }

    public void charList(GameChar[] c){
        for(GameChar i: c){
            i.printCharInfo();
        }

    }

    public void setProperties(GameChar c){
        this.gameChar = c;
        this.charName = c.getCharName();
        this.money = c.getMoney();
        this.damage = c.getDamage();
        this.health = c.getHealth();
    }

    public void printInfo() {
        System.out.println("Oyuncu: " + this.name + "\tKarakter: " + this.charName + "\tSağlık: " + this.health + "\tHasar: " + this.damage + "\tPara: " + this.money);
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
