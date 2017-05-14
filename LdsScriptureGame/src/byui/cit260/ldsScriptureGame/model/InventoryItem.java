/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.model;

import java.io.Serializable;

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
