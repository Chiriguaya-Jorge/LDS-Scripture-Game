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
public class Game implements Serializable {
    
    //Class instance variables
    private String noPeople;
    private double attribute;

    public Game() {
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + ", attribute=" + attribute + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.noPeople);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.attribute) ^ (Double.doubleToLongBits(this.attribute) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.attribute) != Double.doubleToLongBits(other.attribute)) {
            return false;
        }
        if (!Objects.equals(this.noPeople, other.noPeople)) {
            return false;
        }
        return true;
    }
    
    

    public String getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(String noPeople) {
        this.noPeople = noPeople;
    }

    public double getAttribute() {
        return attribute;
    }

    public void setAttribute(double attribute) {
        this.attribute = attribute;
    }
           
}
