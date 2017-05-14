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
public class Character implements Serializable{
  
    //Class instance variables
    private String name;
    private double location;
    private double life;

    public Character() {
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", location=" + location + ", life=" + life + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.location) ^ (Double.doubleToLongBits(this.location) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.life) ^ (Double.doubleToLongBits(this.life) >>> 32));
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
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.location) != Double.doubleToLongBits(other.location)) {
            return false;
        }
        if (Double.doubleToLongBits(this.life) != Double.doubleToLongBits(other.life)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }
}
