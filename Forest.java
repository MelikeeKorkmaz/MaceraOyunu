public class Forest extends BattleLoc {
    Forest(Player player) {
        super();
        setLocName("Orman");
        setPlayer(player);
        setObstacle(new Vampire());
    }

    @Override
    public boolean onLocation() {
        System.out.println("---Ormana Hoş Geldin---");
        System.out.println("Ormanı vampirlerden temizleyebilirsen, karşılığında bir miktar para ve odun alacaksın. Yoksa soğuktan donmayı mı tercih edersin?");
        start();
        if (getPlayer().getHealth() > 0 && getCount() == 0) {
            System.out.println("Tebrikler! " + getObstacle().getName() + " yok edildi. Bölge temizlendi");
            getPlayer().getInventory().setFirewood(true);
            System.out.println("Envanterine odun eklendi");
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
