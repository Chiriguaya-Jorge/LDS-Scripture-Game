/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import lds.scripture.game.team.LDSScriptureGameTeam;
import java.io.PrintWriter;

/**
 *
 * @author Team Assignment Week 12
 */
class ErrorView {
    private static final PrintWriter errorFile = LDSScriptureGameTeam.getOutFile();
   private static final PrintWriter logFile = LDSScriptureGameTeam.getLogFile();

   public static void display(String className, String errorMessage) {

       errorFile.println(
                   "-------------------------------------------------------"
                 + "\n- ERROR - " + errorMessage
                 + "\n-------------------------------------------------------");

        // log error
        logFile.println(className + " - " +  errorMessage); 
    }
}
