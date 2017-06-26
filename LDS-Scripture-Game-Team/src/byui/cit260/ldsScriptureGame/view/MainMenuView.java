/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import byui.cit260.ldsScriptureGame.control.GameControl;
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
        System.out.println("*** Saving ***");
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
    
        GameControl.createNewGame(LDSScriptureGameTeam.getPlayer());
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

}
