package Locations.Stores;

import Abstracts.Location;
import Player.Player;

public class ToolStore extends Location {
    Weapon[] weapons = {new Weapon(1, "Tabanca", 2, 25), new Weapon(2, "Kılıç", 3, 35), new Weapon(3, "Tüfek", 7, 45)};
    Armor[] armors = {new Armor(1, "Light", 1, 15), new Armor(2, "Medium", 3, 25), new Armor(3, "Heavy", 5, 40)};

    public ToolStore(Player player) {
        super();
        setLocName("Mağaza");
        setPlayer(player);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoş geldiniz!");
        System.out.println("Burada kendinize yeni teçhizatlar alabilirsiniz.");
        getPlayer().printInfo();

        System.out.println("----MENU----");
        System.out.print("1-Silahlar\n2-Armorlar\nÇıkış için herhangi bir sayıyı girebilirsiniz.\nMenüde gitmek istediğiniz yeri tuşlayın: ");

        int select = input.nextInt();
        System.out.println("========================");
        buyTool(select);

        System.out.println("----Mağazadan ayrıldınız. Yeniden görüşmek üzere.----");
        getPlayer().printInfo();
        return true;
    }

    public void buyTool(int buy) {
        switch (buy) {
            case 1:
                printWeapons(weapons);
                System.out.print("Çıkış için herhangi bir sayıyı girebilirsiniz.\n Yapmak istediğiniz işlemin numarasını girin: ");
                int c1 = input.nextInt();
                System.out.println("========================");
                if (c1 <= weapons.length && c1 > 0) {
                    if ((getPlayer().getMoney() - weapons[c1 - 1].getCost()) < 0) {
                        System.out.println(weapons[c1 - 1].getName() + " almak için yeterli paranız bulunmamaktadır!");
                    } else {
                        System.out.println(weapons[c1 - 1].getName() + " satın alma işlemi başarı ile gerçekleşmiştir.");
                        getPlayer().setMoney(getPlayer().getMoney() - weapons[c1 - 1].getCost());
                        getPlayer().getInventory().setWeapon(weapons[c1 - 1]);
                        getPlayer().setDamage(getPlayer().getGameChar().getDamage() + weapons[c1 - 1].getDamage());
                    }
                }
                break;
            case 2:
                printArmors(armors);
                System.out.print("Çıkış için herhangi bir sayıyı girebilirsiniz.\n Yapmak istediğiniz işlemin numarasını girin:");
                int c2 = input.nextInt();
                System.out.println("========================");
                if (c2 <= armors.length && c2 > 0) {
                    if ((getPlayer().getMoney() - armors[c2 - 1].getCost()) < 0) {
                        System.out.println(armors[c2 - 1].getName() + " armoru almak için yeterli paranız bulunmamaktadır!");
                    } else {
                        System.out.println(armors[c2 - 1].getName() + " satın alma işlemi başarı ile gerçekleşmiştir.");
                        getPlayer().setMoney(getPlayer().getMoney() - armors[c2 - 1].getCost());
                        getPlayer().getInventory().setArmor(armors[c2 - 1]);
                    }
                }
                break;
        }
    }

    public void printWeapons(Weapon[] weapons) {
        System.out.println("-SİLAHLAR-");
        for (Weapon i : weapons) {
            System.out.println(i.getId() + "-" + i.getName() + " --->" + "\tHasar: " + i.getDamage() + "\tFiyat: " + i.getCost());
        }
    }

    public void printArmors(Armor[] armors) {
        System.out.println("-ARMORLAR-");
        for (Armor i : armors) {
            System.out.println(i.getId() + "-" + i.getName() + " --->" + "\tKoruma: " + i.getProtection() + "\tFiyat: " + i.getCost());
        }
    }
}