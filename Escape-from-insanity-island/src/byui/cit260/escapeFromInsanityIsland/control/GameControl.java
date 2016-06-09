/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;



import byui.cit260.escapeFromInsanityIsland.view.HelpMenuView;
import byui.cit260.escapeFromInsanityIsland.view.StartGameView;
import cit260.escapeFromInsanityIsland.model.Player;
import escape.from.insanity.island.EscapeFromInsanityIsland;



/**
 *
 * @author Karla
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        EscapeFromInsanityIsland.setPlayer(player); //save the player
        
        return player;
        }

    public static void startNewGame(Player player) {
        StartGameView startGameView = new StartGameView();
     
    startGameView.displayStartGameView();
    }

    public static void continueExistingGame(Player player) {
        System.out.println("*** startExistingGame stub function called"); 
    }

    public static void saveGame(Player player) {
       
    }

    public static void displayHelpMenu(Player player) {
            HelpMenuView helpMenuView = new HelpMenuView();
     
            helpMenuView.displayHelpMenuView();
    }

           
    
   
    
}
