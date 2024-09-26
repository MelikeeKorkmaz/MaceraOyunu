import java.util.Scanner;

public class Game {
    Player player;
    Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Oyuna hoş geldiniz.");
        System.out.print("Karakter adını giriniz:");
        String name = input.nextLine();
        Player n1 = new Player(name);

        System.out.println("Sıra karakterde... Nasıl bir karakter oynamak isterdin? ");
        n1.selectChar();

        /*
        System.out.println("1- Güvenli Ev\n2-Mağara\n3-Orman\n4-Nehir\n5-Mağaza");
        System.out.print("Gitmek istediğiniz lokasyonun numarasını girin: ");
        int loc = input.nextInt();
        switch(loc){
            case 1:
                this.location = "Güvenli Ev";
                System.out.println("Güvenli eve hoş geldiniz. Keyfinize bakın burada kimse size zarar veremez. Sağlık kontrolünüz yapıldı. Daha iyi gözüküyorsunuz.");
                break;
            case 2:
                this.location = "Mağara";
                break;
            case 3:
                this.location = "Orman";
                break;
            case 4:
                this.location = "Nehir";
                break;
            case 5:
                this.location = "Mağaza";
            default:
                System.out.println("Yanlış konum girdiniz. Güvenli eve dönüyorsunuz.");
                this.location = "Güvenli Ev";
                }
         */
    }

}
