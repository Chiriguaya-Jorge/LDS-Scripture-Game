/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import byui.cit260.ldsScriptureGame.control.GameControl;
import java.util.Scanner;
import lds.scripture.game.team.LDSScriptureGameTeam;

/**
 *
 * @author Jorge Chiriguaya
 */
public class MainMenuView extends View {
    
    private void startExistingGame(){
        System.out.println("*** Loading ***");
    }
    
    private void saveGame() {
        System.out.println("*** Saved ***");
    }
    
    private void displayHelpMenu() {
        System.out.println("*** This is the help Menu ***");
    }

    public void displayMainMenuView() {

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
   
   
    
    public MainMenuView() {
            super( "\n"
                  + "\n--------------------------------" 
                  + "\n| Main Menu                    |" 
                  + "\n--------------------------------" 
                  + "\nN - Start new game" 
                  + "\nG - Continue" 
                  + "\nH - How to play the game" 
                  + "\nS - Save Game" 
                  + "\nQ - Quit" 
                  + "\n--------------------------------");
    }
 
        private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()< 1) {
                System.out.println("Invalid value: value can not be blank");
                continue;
            }
            break;
        }
        
        return value;
    }
    
    @Override
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
}
