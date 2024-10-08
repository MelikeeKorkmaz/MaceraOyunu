import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Hoş geldin!");
        System.out.println("Karşına çıkan engellerle, hayatta kalmak uğruna savaşacaksın. Yemek, su ve odun bulduğunda amacına ulaşmış olursun. Dikkatli ol! Kolay olmayacak...");
        System.out.println("    ...    ");
        System.out.print("Karakter adınızı girin: ");
        String name = input.nextLine();
        Player n1 = new Player(name);

        System.out.println("Sıra karakterde... Nasıl bir karakter oynamak isterdin? ");
        n1.selectChar();

        Location[] locations = {new SafeHouse(n1), new ToolStore(n1),  new Forest(n1), new River(n1), new Cave(n1)};
        n1.setLoc(locations[0]);
        n1.selectLoc(locations);
    }

}
