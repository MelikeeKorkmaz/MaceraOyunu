package Locations;

import Abstracts.BattleLoc;
import Player.Player;
import Obstacles.Vampire;

public class Forest extends BattleLoc {
    public Forest(Player player) {
        super();
        setLocName("Orman");
        setPlayer(player);
        setObstacle(new Vampire());
        setItemName("odun");
    }
}