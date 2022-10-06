package projectName;
import java.util.Scanner;


public class Player extends Character {
    

    int attitude;
    String name;
     double money;


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void getUserName(Scanner input){
        System.out.println("what is your name, cook?");
        String answer = input.nextLine();
        name = answer;
        System.out.println("nice to meet you " + name);


    }

    public void startCookin(){
        // possible method needed to 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(){
        money = 200.00;
        attitude = 0;
    }

    public Player(double newMoney, int newAttitude){
        money = newMoney;
        attitude = newAttitude;
    }

    
}
