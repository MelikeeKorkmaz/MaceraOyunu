import Abstracts.GameChar;
import Abstracts.Location;
import Characters.Archer;
import Characters.Knight;
import Characters.Samurai;
import Locations.*;
import Player.Player;
import Locations.Stores.ToolStore;

import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Hoş geldin!");
        System.out.println("Karşına çıkan engellerle, hayatta kalmak uğruna savaşacaksın. Yemek, su ve odun bulduğunda amacına ulaşmış olursun. Dikkatli ol! Kolay olmayacak...");
        System.out.println("Bölgeleri canavarlardan temizleyebilirsen eşyalar senin olur. Her öldürdüğün canavar için bir miktar para kazanacaksın.");
        System.out.println("    ...    ");
        System.out.print("Karakter adınızı girin: ");
        String name = input.nextLine();
        Player n1 = new Player();
        n1.setName(name);

        GameChar[] chars = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Sıra karakterde... Nasıl bir karakter oynamak isterdin? ");
        n1.selectChar(chars);

        Location[] locations = {new SafeHouse(n1), new ToolStore(n1), new Cave(n1), new Forest(n1), new River(n1)};
        n1.setLoc(locations[0]);
        n1.selectLoc(locations);
    }
}