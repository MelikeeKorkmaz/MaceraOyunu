public class River extends BattleLoc{
    River(Player player){
        super();
        setLocName("Nehir");
        setPlayer(player);
        setObstacle(new Bear());
    }

    @Override
    public boolean onLocation(){
        System.out.println("---Nehire Hoş Geldin---");
        System.out.println("Nehiri ayılardan temizleyebilirsen, karşılığında bir miktar para ve su alacaksın. Yoksa susuzluktan ölmeyi mi tercih edersin?");
        start();
        if (getPlayer().getHealth() > 0 && getCount() == 0) {
            System.out.println("Tebrikler! " + getObstacle().getName() + " yok edildi. Bölge temizlendi");
            getPlayer().getInventory().setWater(true);
            System.out.println("Envanterine su eklendi");
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
