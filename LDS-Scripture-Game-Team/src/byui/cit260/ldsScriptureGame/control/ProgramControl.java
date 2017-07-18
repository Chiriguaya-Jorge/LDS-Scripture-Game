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
 * @author Jorge Chiriguaya
 * Week 13
 */
public class ProgramControl {
    
    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }    
        
        Player player = new Player();
        player.setName(name);
        
        LDSScriptureGameTeam.setPlayer(player); // save the player
        
        return player;
    }
 
}
