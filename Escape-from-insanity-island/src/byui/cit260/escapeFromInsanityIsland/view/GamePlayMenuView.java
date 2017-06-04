/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import java.util.Scanner;

/**
 *
 * @author Karla
 */
public class GamePlayMenuView {
   private String menu;
    private String promptMessage ;
    private static final String MENU = "\n"
                + "\n----------------------------------"
                + "\n Game Play Menu                       "
                + "\n ---------------------------------"
                + "\nV - View map"
                + "\nI - View inventory"
                + "\nS - Craft medicine Syringe"
                + "\nT - Construct tools"
                + "\nU - Use tool/weapon/syringe"
                + "\nB - Construct boat"
                + "\nM - Move to location"
                + "\nF - Fight beast"
                + "\n----------------------------------";
    
    public GamePlayMenuView(){
        
        System.out.println(MENU);
        this.promptMessage = "\nPlese select a menu option: ";
        
        this.menu = "\nQ - Quit"
                + "\n"
                + "\n----------------------------------"
                + "\nV - View map"
                + "\nI - View inventory"
                + "\nS - Craft medicine Syringe"
                + "\nT - Construct tools"
                + "\nU - Use tool/weapon/syringe"
                + "\nB - Construct boat"
                + "\nM - Move to location"
                + "\nF - Fight beast"
                + "\n----------------------------------";
                }
    
    
   public void displayGamePlayMenuView() {
        boolean done = false; //set flag to not done
        do {
            //promp for and gets players name
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("Q")) //USER WANTS TO QUIT
                    return; //exit the game
            
            //do the requested action adnd display the next view
            done = this.doAction(menuOption);
        } while (!done); 
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false;  //initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();//getnext line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1 ){ //if value is blank
                System.out.println("\nInvalid valude: value cannot be blank");
                continue;
                            }
            break;
        }
        return value; //returns the value enteredjsn
        }

    private boolean doAction(String menuOption) {
       menuOption = menuOption.toUpperCase(); //converts to upper case
       
       switch (menuOption){
           case "V": //VIEW MAP
               this.vewMap();
               
           case "I": //view inventory
               this.viewInventory();
               
           case "S": // craft medicine syringe
               this.craftSyringe ();
            
           case "T": //construct tools
               this.constructTool();
               
           case "W": //construct weapons
               this.constructWeapon();
               
           case "U": //use tool/weapon/syringe
               this.useItem();
               
           case "B": //construct boat
               this.constructBoat();
               
           case "M": //move to location
               this.moveLocation();
               
               
            case "F": //move to location
               this.fightBeast();
               break;
               
              
           default:
               System.out.println("\nInvalid selection *** Try again");
               break;     
       }
       return false;
        }

    private void vewMap() {
        System.out.println("*** viewMap() function called\"); "); 
    }

    private void viewInventory() {
         System.out.println("*** viewInventory() function called"); 
    }

    private void craftSyringe() {
         System.out.println("*** craftSyringe() function called"); 
    }

    private void constructTool() {
         System.out.println("*** constructTool() function called"); 
    }

    private void constructWeapon() {
       System.out.println("*** constructWeapon() function called"); 
    }

    private void useItem() {
         System.out.println("*** useItem() function called"); 
    }

    private void constructBoat() {
         System.out.println("***constructBoat() function called"); 
    }

    private void moveLocation() {
        System.out.println("***moveLocation() function called");
    }

    private void fightBeast() {
        FightBeastView fightBeastView= new FightBeastView();
     
        fightBeastView.displayFightBeastView();}
        
     
}
 
    

