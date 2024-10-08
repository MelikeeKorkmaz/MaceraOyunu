import java.util.Scanner;
import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private String name;
    private int obsCount;

    public Scanner input = new Scanner(System. in);
    public Random r = new Random();

    BattleLoc(String name){
        super();
        this.name = name;
        this.obsCount = 0;
    }

    @Override
    public boolean onLocation(){
        return true;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public int getObsCount(){
        return obsCount;
    }

    public void setObsCount(){
        do {
            this.obsCount = r.nextInt(4);
        }while(this.obsCount == 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
