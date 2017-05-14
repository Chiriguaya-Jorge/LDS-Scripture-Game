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
 * @author jechir
 */
public class weaponTypeItem implements Serializable{
    
    //class instance variable
    private String weaponName;
    private String weaponDescription;
    private double damage;

    public weaponTypeItem() {
    }

    @Override
    public String toString() {
        return "weaponTypeItem{" + "weaponName=" + weaponName + ", weaponDescription=" + weaponDescription + ", damage=" + damage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.weaponName);
        hash = 37 * hash + Objects.hashCode(this.weaponDescription);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.damage) ^ (Double.doubleToLongBits(this.damage) >>> 32));
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
        final weaponTypeItem other = (weaponTypeItem) obj;
        if (Double.doubleToLongBits(this.damage) != Double.doubleToLongBits(other.damage)) {
            return false;
        }
        if (!Objects.equals(this.weaponName, other.weaponName)) {
            return false;
        }
        if (!Objects.equals(this.weaponDescription, other.weaponDescription)) {
            return false;
        }
        return true;
    }
    
    

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponDescription() {
        return weaponDescription;
    }

    public void setWeaponDescription(String weaponDescription) {
        this.weaponDescription = weaponDescription;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
    
}
