/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.from.insanity.island;

import byui.cit260.escapeFromInsanityIsland.view.StartProgramView;
import cit260.escapeFromInsanityIsland.model.Game;
import cit260.escapeFromInsanityIsland.model.Player;

/**
 *
 * @author Karla
 */
public class EscapeFromInsanityIsland {

        private static Game currentGame = null;
        private static Player player = null;
        
        public static void main(String[] args) {
     //create StartProgramOrig and display the start program view
     
     StartProgramView startProgramView = new StartProgramView();
     startProgramView.displayStartProgramView();
     
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        EscapeFromInsanityIsland.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        EscapeFromInsanityIsland.player = player;
    }
        
   

   
}

    /*public static void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } needs another curly brace */ 

