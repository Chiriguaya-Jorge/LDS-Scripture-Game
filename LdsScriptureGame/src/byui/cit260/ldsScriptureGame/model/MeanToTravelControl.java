/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jechirg
 */
public class MeanToTravelControl implements Serializable{
    
    //class instance variables
    private String loadMeanToTravel;
    private String boardMeanToTravel;

    public MeanToTravelControl() {
    }

    @Override
    public String toString() {
        return "MeanToTravelControl{" + "loadMeanToTravel=" + loadMeanToTravel + ", boardMeanToTravel=" + boardMeanToTravel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.loadMeanToTravel);
        hash = 67 * hash + Objects.hashCode(this.boardMeanToTravel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MeanToTravelControl other = (MeanToTravelControl) obj;
        if (!Objects.equals(this.loadMeanToTravel, other.loadMeanToTravel)) {
            return false;
        }
        if (!Objects.equals(this.boardMeanToTravel, other.boardMeanToTravel)) {
            return false;
        }
        return true;
    }
    
    

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
