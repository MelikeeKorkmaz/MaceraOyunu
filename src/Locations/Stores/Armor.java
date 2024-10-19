package Locations.Stores;

public class Armor {
    private int id;
    private String name;
    private int protection;
    private int cost;

    public Armor(int id, String name, int protection, int cost) {
        this.id = id;
        this.name = name;
        this.protection = protection;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}