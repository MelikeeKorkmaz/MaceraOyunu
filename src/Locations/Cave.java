package Locations;

import Abstracts.BattleLoc;
import Player.Player;
import Obstacles.Zombie;

public class Cave extends BattleLoc {
    public Cave(Player player) {
        super();
        setLocName("Mağara");
        setPlayer(player);
        setObstacle(new Zombie());
        setItemName("yemek");
    }
}