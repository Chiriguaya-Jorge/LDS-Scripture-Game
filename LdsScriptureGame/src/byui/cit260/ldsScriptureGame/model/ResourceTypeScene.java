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
public class ResourceTypeScene implements Serializable{
    
    //class instance variables
    private double resourceAvailable;
    private String resourceType;

    public ResourceTypeScene() {
    }

    @Override
    public String toString() {
        return "ResourceTypeScene{" + "resourceAvailable=" + resourceAvailable + ", resourceType=" + resourceType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.resourceAvailable) ^ (Double.doubleToLongBits(this.resourceAvailable) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.resourceType);
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
        final ResourceTypeScene other = (ResourceTypeScene) obj;
        if (Double.doubleToLongBits(this.resourceAvailable) != Double.doubleToLongBits(other.resourceAvailable)) {
            return false;
        }
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        return true;
    }
    
    

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
