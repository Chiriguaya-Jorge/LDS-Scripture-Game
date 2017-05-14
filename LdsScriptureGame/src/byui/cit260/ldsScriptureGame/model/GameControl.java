/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.model;

import java.io.Serializable;

/**
 *
 * @author jechirg
 */
public class GameControl implements Serializable {
    
    //class instance variables
    private double startNewGame;
    private double initializeMap;
    private double saveGame;
    private double retriveGame;
    private double createNewPlayer;

    public double getStartNewGame() {
        return startNewGame;
    }

    public void setStartNewGame(double startNewGame) {
        this.startNewGame = startNewGame;
    }

    public double getInitializeMap() {
        return initializeMap;
    }

    public void setInitializeMap(double initializeMap) {
        this.initializeMap = initializeMap;
    }

    public double getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(double saveGame) {
        this.saveGame = saveGame;
    }

    public double getRetriveGame() {
        return retriveGame;
    }

    public void setRetriveGame(double retriveGame) {
        this.retriveGame = retriveGame;
    }

    public double getCreateNewPlayer() {
        return createNewPlayer;
    }

    public void setCreateNewPlayer(double createNewPlayer) {
        this.createNewPlayer = createNewPlayer;
    }
    
}
