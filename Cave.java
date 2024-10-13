public class Cave extends BattleLoc{
    Cave(Player player){
        super();
        setLocName("Mağara");
        setPlayer(player);
        setObstacle(new Zombie());
    }

    @Override
    public boolean onLocation(){
        System.out.println("---Mağaraya Hoş Geldin---");
        System.out.println("Mağarayı zombilerden temizleyebilirsen, karşılığında bir miktar para ve yemek alacaksın. Yoksa açlıktan ölmeyi mi tercih edersin?");
        start();
        if (getPlayer().getHealth() > 0 && getCount() == 0) {
            System.out.println("Tebrikler! " + getObstacle().getName() + " yok edildi. Bölge temizlendi");
            getPlayer().getInventory().setFood(true);
            System.out.println("Envanterine yemek eklendi");
            if(isWin()){
                return false;
            }
        }else if(getPlayer().getHealth() <= 0){
            System.out.println("Öldünüz!\n----GAME OVER----");
            return false;
        }
        return true;
    }
}
