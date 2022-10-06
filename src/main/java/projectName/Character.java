package projectName;


public class Character {
    double money;
    int attitude;
    String name;


    
    
    // constructors
    public Character (){
        money = 200.00;
        attitude = 0;

    }

    public Character (double newMoney, int newAttitude){

        money = newMoney;
        attitude = newAttitude;
    }


    //states role of class object
    public void stateRole(){
        System.out.println("my role is Narrorator" + "\n" + "I'm technically not real");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
