/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import java.util.Scanner;
import byui.cit260.ldsScriptureGame.control.GameControl;
import lds.scripture.game.team.LDSScriptureGameTeam;

/**
 *
 * @author hp
 */
public class MainMenuView {
    
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

    public void displayMainMenuView() {

        boolean done = false;
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
        
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
        
    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------" 
                  + "\n| Main Menu                    |" 
                  + "\n--------------------------------" 
                  + "\nN - Start new game" 
                  + "\nG - Continue" 
                  + "\nH - How to play the game" 
                  + "\nS - Save Game" 
                  + "\nQ - Quit" 
                  + "\n--------------------------------";
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
 
}