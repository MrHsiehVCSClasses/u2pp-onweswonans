package projectName;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        int i = 0;
        
        //creates scanner
        Scanner input = new Scanner(System.in);
        Character Narrorator = new Character();
    
        // creates charater that you play as
        Player playerOne = new Player();
    
    
        //creates your pal jesse as a dealer
        Dealer jesse = new Dealer();
        Dealer badger = new Dealer();
        Dealer skinnyPete = new Dealer();
    
    
        //creates someone to buy items from
        Narrorator.stateRole();

        playerOne.getUserName(input);
        // allows player to buy dealers and set ownedByPlayer to true
        while ( i != 4){
            System.out.println("who would you like to hire?" + "\n" + "1 : Jesse for " + jesse.getCost() +"\n" + "2 : Badger for " + badger.getCost() +"\n" + "3 : Skinny Pete for "  + skinnyPete.getCost() + "\n" + "4 : done purchasing");
            i = input.nextInt();
            
            if( i == 1){
                System.out.println("Jesser is on payroll");
                jesse.setOwnedByPlayer(true);  
                Double playerMon = playerOne.getMoney(); 
                Double dealerPrice = jesse.getCost();
                Double total = playerMon - dealerPrice;
                playerOne.setMoney(total);
                System.out.println("you have "+ playerOne.getMoney() + " left"); 
            } else if (i == 2){
                System.out.println("Badger is on payrole");
                badger.setOwnedByPlayer(true);
                Double playerMon = playerOne.getMoney(); 
                Double dealerPrice = badger.getCost();
                Double total = playerMon - dealerPrice;
                playerOne.setMoney(total);
                System.out.println("you have "+ playerOne.getMoney() + " left"); 
            } else if( i == 3){
                System.out.println("Skinny Pete is on payroll");
                skinnyPete.setOwnedByPlayer(true);
                Double playerMon = playerOne.getMoney(); 
                Double dealerPrice = skinnyPete.getCost();
                Double total = playerMon - dealerPrice;
                playerOne.setMoney(total);
                System.out.println("you have "+ playerOne.getMoney() + " left"); 
            } else if (i !=4){
                System.out.println("quit playin foo!");
            }

        }

        



        
        

    }
}
