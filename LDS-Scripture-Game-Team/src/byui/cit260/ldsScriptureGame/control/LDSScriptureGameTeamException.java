/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.control;

/**
 *
 * @author Jorge Chiriguaya
 * Week 13
 */
public class LDSScriptureGameTeamException extends Exception {

    public LDSScriptureGameTeamException() {
    }

    public LDSScriptureGameTeamException(String message) {
        super(message);
    }

    public LDSScriptureGameTeamException(Throwable cause) {
        super(cause);
    }

    public LDSScriptureGameTeamException(String message, Throwable cause) {
        super(message, cause);
    } 
}