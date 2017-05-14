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
public class PersonTypeScene implements Serializable{
    
    //class instance variables
    private String scenePersonDescription;
    private String sceneName;

    public PersonTypeScene() {
    }

    @Override
    public String toString() {
        return "PersonTypeScene{" + "scenePersonDescription=" + scenePersonDescription + ", sceneName=" + sceneName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.scenePersonDescription);
        hash = 97 * hash + Objects.hashCode(this.sceneName);
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
        final PersonTypeScene other = (PersonTypeScene) obj;
        if (!Objects.equals(this.scenePersonDescription, other.scenePersonDescription)) {
            return false;
        }
        if (!Objects.equals(this.sceneName, other.sceneName)) {
            return false;
        }
        return true;
    }
    
    

    public String getScenePersonDescription() {
        return scenePersonDescription;
    }

    public void setScenePersonDescription(String scenePersonDescription) {
        this.scenePersonDescription = scenePersonDescription;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }
    
}
