package Abstracts;

import java.util.Scanner;
import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String itemName;
    private int obsCount = 0;
    private int count;
    private int obsHealth;

    public Scanner input = new Scanner(System.in);
    public Random r = new Random();

    protected BattleLoc() {
        super();
        setLocName("Savaş Bölgeleri");
    }

    public boolean onLocation() {
        System.out.println("---" + getLocName() + "---");
        System.out.println("Bu bölgeyi yaratıklardan temizleyebilirsen, karşılığında bir miktar para ve " + getItemName() + " alacaksın.");
        start();
        if (getPlayer().getHealth() > 0 && getCount() == 0) {
            System.out.println("Tebrikler! " + getObstacle().getName() + " yok edildi. Bölge temizlendi");
            itemReward();
            if (isWin()) {
                return false;
            }
        } else if (getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz!\n----GAME OVER----");
            return false;
        }
        return true;
    }

    public void obsCounter() {
        while (this.count == 0) {
            this.obsCount = r.nextInt(4);
            this.count = this.obsCount;
        }
    }

    public void start() {
        obsCounter();
        this.obsHealth = getObstacle().getHealth();
        System.out.println(this.count + " tane " + this.obstacle.getName() + " size doğru yaklaşıyor!");
        getPlayer().printInfo();
        getObstacle().printObsInfo();
        menu();
    }

    public void menu() {
        System.out.print("\n1- Saldır!\n2- Kaç!\nŞimdi ne yapacaksın? ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                war();
                break;
            case 2:
                System.out.println("Korkak!");
        }
    }

    public void war() {
        System.out.println("--------");
        this.obstacle.setHealth(getObstacle().getHealth() - getPlayer().getDamage());
        System.out.println(getPlayer().getDamage() + " hasar verdiniz.\t" + this.obstacle.getName() + " sağlığı: " + this.obstacle.getHealth());

        if (this.obstacle.getHealth() <= 0) {
            this.count--;
            System.out.println(this.obstacle.getName() + " öldü.\tKalan " + this.obstacle.getName() + " Sayısı: " + this.count);
            moneyReward();
            System.out.println(this.obstacle.getMoney() + " dolar kazandınız. Güncel bakiyeniz: " + getPlayer().getMoney());
            this.obstacle.setHealth(this.obsHealth);

        }
        if (this.count > 0) {
            getPlayer().setHealth(getPlayer().getHealth() - (this.obstacle.getDamage() - getPlayer().getInventory().getArmor().getProtection()));
            System.out.println(this.obstacle.getName() + " size " + (this.obstacle.getDamage() - getPlayer().getInventory().getArmor().getProtection()) + " hasar verdi. Canınız: " + getPlayer().getHealth());
        }
        if (getPlayer().getHealth() > 0 && this.count > 0) {
            menu();
        }
    }

    public boolean isWin() {
        if (getPlayer().getInventory().isWater() && getPlayer().getInventory().isFood() && getPlayer().getInventory().isFirewood()) {
            System.out.println("\n*****************************");
            System.out.println("Tebrikler Oyunu Kazandınız!!!");
            System.out.println("*****************************");
        } else {
            return false;
        }
        return true;
    }

    public void moneyReward() {
        getPlayer().setMoney(getPlayer().getMoney() + this.obstacle.getMoney());
    }

    public void itemReward() {
        if (getLocName().equals("Orman")) {
            getPlayer().getInventory().setFirewood(true);
        } else if (getLocName().equals("Nehir")) {
            getPlayer().getInventory().setWater(true);
        } else if (getLocName().equals("Mağara")) {
            getPlayer().getInventory().setFood(true);
        }
        System.out.println("Envanterine " + getItemName() + " eklendi");
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getObsCount() {
        return obsCount;
    }

    public void setObsCount(int obsCount) {
        this.obsCount = obsCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getObsHealth() {
        return obsHealth;
    }

    public void setObsHealth(int obsHealth) {
        this.obsHealth = obsHealth;
    }
}
