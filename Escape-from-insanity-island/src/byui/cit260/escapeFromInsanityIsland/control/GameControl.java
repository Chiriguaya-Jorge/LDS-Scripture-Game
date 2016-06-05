/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;



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

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called");
    }

    public static void startExistingGame(Player player) {
        System.out.println("*** startExistingGame stub function called"); 
    }

    public static void saveGame(Player player) {
       System.out.println("*** saveGame stub function called"); 
    }
       
    
    
}
