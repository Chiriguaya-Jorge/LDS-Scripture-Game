/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.model;

import byui.cit260.ldsScriptureGame.enums.SceneGroup;
import byui.cit260.ldsScriptureGame.enums.Item;

/**
 *
 * @author Jorge Chiriguaya
 */
public class ResourceScene extends Scene {
    
    private double amountOfResource;
    private Item resourceType;

    public ResourceScene() {
    }

    public ResourceScene(SceneGroup sceneGroup, String description, 
                         String mapSymbol, double travelTime, 
                         boolean blocked, double amountOfResource,
                         Item resourceType) {
        super(sceneGroup, description, mapSymbol, travelTime, blocked);
        this.amountOfResource = amountOfResource;
        this.resourceType = resourceType;
    }



    public double getAmountOfResource() {
        return amountOfResource;
    }

    public void setAmountOfResource(double amountOfResource) {
        this.amountOfResource = amountOfResource;
    }

    public Item getResourceType() {
        return resourceType;
    }

    public void setResourceType(Item resourceType) {
        this.resourceType = resourceType;
    }
}
