public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player){
        super("Güvenli Ev");
        setPlayer(player);
    }

    @Override
    public boolean onLocation(){
        System.out.println("Güvenli evdesiniz. Keyfinize bakın burada kimse size zarar veremez.");
        getPlayer().setHealth(getPlayer().getGameChar().getHealth());
        System.out.println("Sağlık kontrolünüz yapıldı. Daha iyi gözüküyorsunuz ");
        return true;
    }
}
