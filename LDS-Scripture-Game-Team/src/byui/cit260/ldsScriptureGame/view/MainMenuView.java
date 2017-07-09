/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import byui.cit260.ldsScriptureGame.control.GameControl;
import lds.scripture.game.team.LDSScriptureGameTeam;
import byui.cit260.ldsScriptureGame.exceptions.MapControlException;

/**
 *
 * @author Jorge Chiriguaya
 * TEAM WORK Week 12
 */
public class MainMenuView extends View {
    
    private void startExistingGame(){
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        } 

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        String filePath = this.getInput();     
        
        try {
            // save the game to the speciried file
            GameControl.saveGame(LDSScriptureGameTeam.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        } 
    }
    
    private void displayHelpMenu() {        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
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
 
    @Override
       public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
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
    
        try {   
            // create a new game
            GameControl.createNewGame(LDSScriptureGameTeam.getPlayer());    
        } catch (MapControlException mce) {
            ErrorView.display("MainMenuView", mce.getMessage());
            return;
        } 

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
