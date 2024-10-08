public abstract class Obstacle {
    private int id;
    private String name;
    private int health;
    private int damage;

    Obstacle(int id ,String name, int health, int damage){
        this.id = id;
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void printObsInfo(){
        System.out.println(getName() + ":\tSağlık: " + getHealth() + "\tHasar: " + getDamage());
    }

    public int getId(){
       return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
