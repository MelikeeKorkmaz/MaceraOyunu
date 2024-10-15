public class Forest extends BattleLoc {
    Forest(Player player) {
        super();
        setLocName("Orman");
        setPlayer(player);
        setObstacle(new Vampire());
        setItemName("odun");
    }
}
