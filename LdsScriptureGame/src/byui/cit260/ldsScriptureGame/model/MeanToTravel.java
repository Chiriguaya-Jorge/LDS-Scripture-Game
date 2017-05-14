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
public class MeanToTravel implements Serializable{
    
    //class instance varibles
    private String description;
    private double width;
    private double length;
    private double height;
    private double maxCapacity;

    public MeanToTravel() {
    }

    @Override
    public String toString() {
        return "MeanToTravel{" + "description=" + description + ", width=" + width + ", length=" + length + ", height=" + height + ", maxCapacity=" + maxCapacity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.maxCapacity) ^ (Double.doubleToLongBits(this.maxCapacity) >>> 32));
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
        final MeanToTravel other = (MeanToTravel) obj;
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxCapacity) != Double.doubleToLongBits(other.maxCapacity)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    
}
