/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.model;

import java.io.Serializable;

/**
 *
 * @author jechir
 */
public class weaponTypeItem implements Serializable{
    
    //class instance variable
    private String weaponName;
    private String weaponDescription;
    private double damage;

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
