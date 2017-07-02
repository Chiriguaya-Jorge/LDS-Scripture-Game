/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lds.scripture.game.team;
//loading
import byui.cit260.ldsScriptureGame.model.Player;
import byui.cit260.ldsScriptureGame.view.StartProgramView;
import byui.cit260.ldsScriptureGame.model.Game;
/**
 *
 * @author Reinaldo
 */
public class LDSScriptureGameTeam {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    
    
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       try {
       startProgramView.displayStartProgramView();
       } catch (Throwable te) {
                System.out.println(te.getMessage());
                te.printStackTrace();
                startProgramView.displayStartProgramView();
       }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        LDSScriptureGameTeam.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        LDSScriptureGameTeam.player = player;
    }
    
    
}