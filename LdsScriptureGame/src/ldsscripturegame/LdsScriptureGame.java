/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldsscripturegame;

import byui.cit260.ldsScriptureGame.model.Player;

/**
 *
 * @author hp
 */
public class LdsScriptureGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Jorge Chiriguaya");
        playerOne.setLife(100.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
