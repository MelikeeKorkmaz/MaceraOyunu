public class Cave extends BattleLoc{
    Cave(Player player){
        super("Mağara");
        setPlayer(player);
    }

    @Override
    public boolean onLocation(){
        System.out.println("Mağaraya Hoş geldiniz!");
        do {
            setObsCount();
        }while(getObsCount() == 0);
        return true;
    }
}
