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
public class ResourceTypeScene implements Serializable{
    
    //class instance variables
    private double resourceAvailable;
    private String resourceType;

    public double getResourceAvailable() {
        return resourceAvailable;
    }

    public void setResourceAvailable(double resourceAvailable) {
        this.resourceAvailable = resourceAvailable;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
}
