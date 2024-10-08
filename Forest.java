public class Forest extends BattleLoc {
    public int obsC;

    Forest(Player player) {
        super("Orman");
        setObstacle(new Vampire());
        setPlayer(player);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Ormana Hoş geldin!");
        System.out.println("Ormanı vampirlerden temizleyebilirsen, karşılığında bir miktar para ve odun alacaksın. Yoksa soğuktan donmayı tercih mi edersin?");
        //buraları düşün her seferinde gir çık ile düşman sayısı azaltılabilir. Dikkat
        setObsCount();
        this.obsC = getObsCount();

        System.out.println(this.obsC + " vampir size doğru yaklaşıyor!");
        getPlayer().printInfo();
        getObstacle().printObsInfo();
        System.out.print("\n1- Saldır!\n2- Kaç!\nŞimdi ne yapacaksın? ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                war();
                if (getPlayer().getHealth() > 0) {
                    System.out.println("Tebrikler! Bütün vampirler yok edildi.");
                    //Kazandığı paralar ve esyalar eklenecek
                }
                break;
            case 2:
                System.out.println("Korkak!");
        }

        if(getPlayer().getHealth() <= 0){
            System.out.println("Öldünüz!");
            return false;
        }
        return true;
    }


    public void war() {
        System.out.println("Saldırı zamanı!");
        //bu gerekli mi
        setObstacle(new Vampire());

        while (getPlayer().getHealth() > 0 && this.obsC > 0) {
            System.out.println("--------");
            getObstacle().setHealth(getObstacle().getHealth() - getPlayer().getDamage());
            System.out.println(getPlayer().getDamage() + " hasar verdiniz.\tVampirin canı: " + getObstacle().getHealth());

            if (getObstacle().getHealth() <= 0) {
                this.obsC--;
                System.out.println("Vampir öldü.\tKalan vampir sayısı: " + this.obsC);
                if (this.obsC > 0) {
                    setObstacle(new Vampire());
                }
            }

            if (this.obsC > 0) {
                getPlayer().setHealth(getPlayer().getHealth() - getObstacle().getDamage());
                System.out.println("Vampir size " + getObstacle().getDamage() + " hasar verdi. Canınız: " + getPlayer().getHealth());
            }
        }
    }
}

