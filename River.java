public class River extends BattleLoc{
    River(Player player){
        super("Nehir");
        setPlayer(player);
    }

    @Override
    public boolean onLocation(){
        System.out.println("Nehire Hoş geldiniz!");
        do {
            setObsCount();
        }while(getObsCount() == 0);
        return true;
    }
}
