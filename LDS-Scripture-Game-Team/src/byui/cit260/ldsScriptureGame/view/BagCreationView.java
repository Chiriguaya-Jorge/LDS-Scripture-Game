/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import byui.cit260.ldsScriptureGame.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Reinaldo
 */
public class BagCreationView {
    
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

    private boolean doAction(String menuOption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
        GameControl.createNewGame(LDSScriptureGame.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void waterBagCreation(){
        System.out.println("");
    }
    
  
}
