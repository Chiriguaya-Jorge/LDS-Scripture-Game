/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.escapeFromInsanityIsland.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Karla
 */
public class Character implements Serializable{
    
    private String name;
    private double characterLife;
    private boolean location;
    private double beastDamage;
    
    
    public Character() {
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCharacterlife() {
        return characterLife;
    }

    public void setCharacterlife(double characterLife) {
        this.characterLife = characterLife;
    }

    public boolean isLocation() {
        return location;
    }

    public void setLocation(boolean location) {
        this.location = location;
    }

    public double getBeastDamage() {
        return beastDamage;
    }

    public void setBeastDamage(double beastDamage) {
        this.beastDamage = beastDamage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.characterLife) ^ (Double.doubleToLongBits(this.characterLife) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.beastDamage) ^ (Double.doubleToLongBits(this.beastDamage) >>> 32));
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
        if (Double.doubleToLongBits(this.characterLife) != Double.doubleToLongBits(other.characterLife)) {
            return false;
        }
        if (this.location != other.location) {
            return false;
        }
        if (Double.doubleToLongBits(this.beastDamage) != Double.doubleToLongBits(other.beastDamage)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", characterlife=" + characterLife + ", location=" + location + ", beastDamage=" + beastDamage + '}';
    }

    public void setLife(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCharacterBeastDamage(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBeastDamage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCharacterLife(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
    
   }