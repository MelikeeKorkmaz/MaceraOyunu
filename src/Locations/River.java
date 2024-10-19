package Locations;

import Abstracts.BattleLoc;
import Obstacles.Bear;
import Player.Player;

public class River extends BattleLoc {
    public River(Player player) {
        super();
        setLocName("Nehir");
        setPlayer(player);
        setObstacle(new Bear());
        setItemName("su");
    }
}