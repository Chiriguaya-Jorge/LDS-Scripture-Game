/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.escapeFromInsanityIsland.model;

import java.io.Serializable;

/**
 *
 * @author Karla
 */
public class Inventory implements Serializable {
    private boolean InventoryList;

    public Inventory() {
    }
    
    public boolean isInventoryList() {
        return InventoryList;
    }

    public void setInventoryList(boolean InventoryList) {
        this.InventoryList = InventoryList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.InventoryList ? 1 : 0);
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
        final Inventory other = (Inventory) obj;
        if (this.InventoryList != other.InventoryList) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "InventoryList=" + InventoryList + '}';
    }
    
    
    
    
    
    
    
}
