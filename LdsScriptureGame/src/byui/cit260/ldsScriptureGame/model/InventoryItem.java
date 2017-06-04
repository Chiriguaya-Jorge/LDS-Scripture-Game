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
 * @author hp
 */
public class InventoryItem implements Serializable{
    
    //class instance variable
    private String ItemType;
    private double quantituInStock;
    private double requiredAmount;
    private String itemName;

    public InventoryItem() {
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "ItemType=" + ItemType + ", quantituInStock=" + quantituInStock + ", requiredAmount=" + requiredAmount + ", itemName=" + itemName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.ItemType);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.quantituInStock) ^ (Double.doubleToLongBits(this.quantituInStock) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.itemName);
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
        final InventoryItem other = (InventoryItem) obj;
        if (Double.doubleToLongBits(this.quantituInStock) != Double.doubleToLongBits(other.quantituInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        if (!Objects.equals(this.ItemType, other.ItemType)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        return true;
    }
    
    

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    public double getQuantituInStock() {
        return quantituInStock;
    }

    public void setQuantituInStock(double quantituInStock) {
        this.quantituInStock = quantituInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
}
