package projectName;

public class Dealer extends Character {
    double money;
    int attitude;
    String name;
    int effective;
    double cost;
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    boolean ownedByPlayer;
    double successRate;


    // constuctors
    public Dealer(){
        super();
        effective = 2;      //speed at which meth is sold
        cost = 10.75;
        ownedByPlayer = false;
        successRate = 75.00;
    }
    public Dealer(double newMoney ,int newAttitude,int newEffective,double newCost, boolean newOwnedByPlayer, double newSuccessRate){
        super(newMoney, newAttitude);
        effective = newEffective;
        cost = newCost;
        ownedByPlayer = newOwnedByPlayer;
        successRate = newSuccessRate;
    }
    public boolean isOwnedByPlayer() {
        return ownedByPlayer;
    }
    public void setOwnedByPlayer(boolean ownedByPlayer) {
        this.ownedByPlayer = ownedByPlayer;
    }
//states role of object
    public void stateRole(){
        System.out.println("yo, yo, yo!!! ima dealer fool! tighttighttighttighttight!!!!");
    }
}
