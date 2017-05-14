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
public class PersonTypeScene implements Serializable{
    
    //class instance variables
    private String scenePersonDescription;
    private String sceneName;

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
