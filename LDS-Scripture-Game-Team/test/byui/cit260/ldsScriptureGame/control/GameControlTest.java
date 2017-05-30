/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.control;

import byui.cit260.ldsScriptureGame.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dnp
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of createPlayer method, of class GameControl.
     */
    @Test
    public void testCreatePlayer() {
        System.out.println("createPlayer");
        String playersName = "";
        Player expResult = null;
        Player result = GameControl.createPlayer(playersName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startNewGame method, of class GameControl.
     */
    @Test
    public void testStartNewGame() {
        System.out.println("startNewGame");
        Player player = null;
        GameControl.startNewGame(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of continueExistingGame method, of class GameControl.
     */
    @Test
    public void testContinueExistingGame() {
        System.out.println("continueExistingGame");
        Player player = null;
        GameControl.continueExistingGame(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame() {
        System.out.println("saveGame");
        Player player = null;
        GameControl.saveGame(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
