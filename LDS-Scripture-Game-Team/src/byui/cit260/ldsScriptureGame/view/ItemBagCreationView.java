/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;
import byui.cit260.ldsScriptureGame.control.GameControl;
import lds.scripture.game.team.LDSScriptureGameTeam;
import byui.cit260.ldsScriptureGame.model.Player;
import java.util.Scanner;
/**
 *
 * @author Reinaldo
 */
public class ItemBagCreationView {
  
    public void displayItemBagCreationView() {

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
    
    public ItemBagCreationView() {
        this.menu = "\n"
                  + "\n------------------------------------------" 
                  + "\n| Item Bag Creation                      |" 
                  + "\n------------------------------------------" 
                  + "\n The largest bag that can be created has  " 
                  + "\n a volume of 40. Anything larger would    " 
                  + "\n be too big for a person to carry long    " 
                  + "\n distances.In addition, the value of each "
                  + "\n parameter should not be greater than 5   "
                  + "\n------------------------------------------" 
                  + "\nQ - Quit                                  " 
                  + "\n------------------------------------------";
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
            case "N": 
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
        
        return false;
}

    private void startNewGame(){
    
        GameControl.createNewGame(LDSScriptureGameTeam.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void startExistingGame(){
        System.out.println("");
    }
    
    private void saveGame() {
        System.out.println("");
    }
    
    private void displayHelpMenu() {
        System.out.println("");
    }

}
