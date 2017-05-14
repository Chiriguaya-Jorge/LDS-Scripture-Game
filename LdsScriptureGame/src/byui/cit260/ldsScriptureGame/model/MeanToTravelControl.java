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
public class MeanToTravelControl implements Serializable{
    
    //class instance variables
    private String loadMeanToTravel;
    private String boardMeanToTravel;

    public String getLoadMeanToTravel() {
        return loadMeanToTravel;
    }

    public void setLoadMeanToTravel(String loadMeanToTravel) {
        this.loadMeanToTravel = loadMeanToTravel;
    }

    public String getBoardMeanToTravel() {
        return boardMeanToTravel;
    }

    public void setBoardMeanToTravel(String boardMeanToTravel) {
        this.boardMeanToTravel = boardMeanToTravel;
    }
    
}
