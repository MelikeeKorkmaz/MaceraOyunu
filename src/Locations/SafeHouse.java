package Locations;

import Abstracts.Location;
import Player.Player;

public class SafeHouse extends Location {
    public SafeHouse(Player player) {
        super();
        setLocName("Güvenli Ev");
        setPlayer(player);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz. Sağlığınız yenilenecektir. Keyfinize bakın burada kimse size zarar veremez.");
        getPlayer().setHealth(getPlayer().getGameChar().getHealth());
        System.out.println("Sağlık kontrolünüz yapıldı. Daha iyi gözüküyorsunuz ");
        return true;
    }
}