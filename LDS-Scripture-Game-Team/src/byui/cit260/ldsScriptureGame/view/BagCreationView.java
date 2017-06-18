/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import java.util.Scanner;

/**
 *
 * @author Reinaldo
 */
public class BagCreationView extends View {
    
        public void displayBagCreationView() {

       boolean  done = false;
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
        
    }
    private String menu;
    
    public BagCreationView() {
        this.menu = "\n"
                  + "\n--------------------------------" 
                  + "\n| Bag Creation Menu            |" 
                  + "\n--------------------------------" 
                  + "\nI - Item Bag" 
                  + "\nW - Water Bag" 
                  + "\nQ - Quit" 
                  + "\n--------------------------------";
    }

    private String getMenuOption() {
    System.out.println();
    //prompt to enter the users name
    System.out.println("\nPlease enter the value");

    // create an input file for the console
    Scanner inFile;
    inFile = new Scanner(System.in);

    // read the value of the next line typed in the console
    String name = inFile.nextLine();
        return null;
    }

    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "I": 
                this.itemBagCreation();
                break;
            case "W":
                this.waterBagCreation();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
        
        return false;
}

    private void itemBagCreation(){
    
       System.out.println("*** ITEM BAGS CREATED ***");
    }
    
    private void waterBagCreation(){
        System.out.println("*** WATER BAG CREATED ***");
    }
    
  
}
