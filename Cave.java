public class Cave extends BattleLoc {
    Cave(Player player) {
        super();
        setLocName("Mağara");
        setPlayer(player);
        setObstacle(new Zombie());
        setItemName("yemek");
    }
}
