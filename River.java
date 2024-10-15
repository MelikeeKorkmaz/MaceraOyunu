public class River extends BattleLoc {
    River(Player player) {
        super();
        setLocName("Nehir");
        setPlayer(player);
        setObstacle(new Bear());
        setItemName("su");
    }
}
