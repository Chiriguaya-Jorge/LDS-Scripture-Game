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
public class Game implements Serializable {
    
    //Class instance variables
    private String noPeople;
    private double attribute;

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
