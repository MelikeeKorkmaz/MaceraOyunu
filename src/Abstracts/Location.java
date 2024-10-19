package Abstracts;

import Player.Player;

import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String locName;
    public static Scanner input = new Scanner(System.in);

    public Location() {
    }

    public boolean onLocation() {
        return true;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }
}