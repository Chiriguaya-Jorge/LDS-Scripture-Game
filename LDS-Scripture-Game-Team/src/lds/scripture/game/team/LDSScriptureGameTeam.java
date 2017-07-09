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
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;

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
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
       try {
            
            // open charcter stream files for end user input and output
            LDSScriptureGameTeam.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            LDSScriptureGameTeam.outFile = new PrintWriter(System.out, true);
        
            // open log file
            String filePath = "log.txt";
            LDSScriptureGameTeam.logFile = new PrintWriter(filePath);


            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return; 

        } catch (Throwable e) {
              
                System.out.println("Exception: " + e.toString() + 
                                   "\nCause: " + e.getCause() + 
                                   "\nMessage: " + e.getMessage());

                e.printStackTrace();;
        }

        finally {
            try {
                if (LDSScriptureGameTeam.inFile != null)
                    LDSScriptureGameTeam.inFile.close();
                
                if (LDSScriptureGameTeam.outFile != null)
                    LDSScriptureGameTeam.outFile.close();
                
                if (LDSScriptureGameTeam.logFile != null)
                    LDSScriptureGameTeam.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }   
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
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        LDSScriptureGameTeam.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        LDSScriptureGameTeam.inFile = inFile;
    }



    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        LDSScriptureGameTeam.logFile = logFile;
    }
    
}