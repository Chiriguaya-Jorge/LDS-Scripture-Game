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
public class Scene implements Serializable{
    
    //class instance variables
    private String sceneDescription;

    public Scene() {
    }

    @Override
    public String toString() {
        return "Scene{" + "sceneDescription=" + sceneDescription + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.sceneDescription);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.sceneDescription, other.sceneDescription)) {
            return false;
        }
        return true;
    }
    
    

    public String getSceneDescription() {
        return sceneDescription;
    }

    public void setSceneDescription(String sceneDescription) {
        this.sceneDescription = sceneDescription;
    }
    
}
