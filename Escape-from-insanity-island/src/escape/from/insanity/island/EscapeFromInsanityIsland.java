/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.from.insanity.island;

import cit260.escapeFromInsanityIsland.model.Player;

/**
 *
 * @author Karla
 */
public class EscapeFromInsanityIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
    
    
    playerOne.setName("Karla Cruz");
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    }
    
}
