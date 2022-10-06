package projectName;

public class Shopkeep extends Character{
    double money;
    int attitude;
    String name;
    boolean blackMarket;
    double suspicion;
    public Shopkeep(){
        super();
        blackMarket = false;
        suspicion = 0.00;

    }

    public Shopkeep(double newMoney, int newAttitude, boolean newBlackMarket, double newSuspicion){
        super(newMoney,newAttitude);
        blackMarket = newBlackMarket;
        suspicion = newSuspicion;
    }
}
