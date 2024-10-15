public abstract class NormalLoc extends Location{
    public NormalLoc(){
        super();
    }

    @Override
    public boolean onLocation(){
        System.out.println("Güvenli Bölgeler");
        return true;
    }
}
