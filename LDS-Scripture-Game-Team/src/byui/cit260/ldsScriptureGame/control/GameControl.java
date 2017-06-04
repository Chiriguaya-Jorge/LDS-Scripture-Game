/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.control;

import byui.cit260.ldsScriptureGame.model.Player;
import lds.scripture.game.team.LDSScriptureGameTeam;

/**
 *
 * @author dnp
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        LDSScriptureGameTeam.setPlayer(player); //save the player
        
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
    
   
     
}
