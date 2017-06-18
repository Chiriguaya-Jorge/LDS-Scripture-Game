/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.control;

import byui.cit260.ldsScriptureGame.model.Player;
import byui.cit260.ldsScriptureGame.model.Game;
import lds.scripture.game.team.LDSScriptureGameTeam;
import byui.cit260.ldsScriptureGame.model.Item;
import byui.cit260.ldsScriptureGame.model.InventoryItem;
import byui.cit260.ldsScriptureGame.model.Location;
import byui.cit260.ldsScriptureGame.model.Map;
import java.awt.Point;

/**
 *
 * @author Jorge Chiriguaya
 */
public class GameControl {

    public static Player createPlayer(String name) {

        Player player = new Player();
        player.setName(name);
        
        LDSScriptureGameTeam.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("*** Loading ***");
    }
    public static InventoryItem[] createInventoryList() {
        // created array(list) of inventory items    
        InventoryItem[] inventory = 
            new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem leather = new InventoryItem();
        leather.setDescription("Leather");
        leather.setQuantityInStock(0);
        leather.setRequiredAmount(0);
        inventory[Item.leather.ordinal()] = leather;
        
        InventoryItem camel = new InventoryItem();
        camel.setDescription("Camel");
        camel.setQuantityInStock(0);
        camel.setRequiredAmount(0);
        inventory[Item.camel.ordinal()] = camel;
        
        InventoryItem grain = new InventoryItem();
        grain.setDescription("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount(0);
        inventory[Item.grain.ordinal()] = grain;
        
        InventoryItem legumes = new InventoryItem();
        legumes.setDescription("Legumes");
        legumes.setQuantityInStock(0);
        legumes.setRequiredAmount(0);
        inventory[Item.legume.ordinal()] = legumes;
        
        InventoryItem oil = new InventoryItem();
        oil.setDescription("Olive Oil");
        oil.setQuantityInStock(0);
        oil.setRequiredAmount(0);
        inventory[Item.oil.ordinal()] = oil;
        
        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;
        
        InventoryItem meat = new InventoryItem();
        meat.setDescription("Meat");
        meat.setQuantityInStock(0);
        meat.setRequiredAmount(0);
        inventory[Item.meat.ordinal()] = meat;
        
        InventoryItem salt = new InventoryItem();
        salt.setDescription("Salt");
        salt.setQuantityInStock(0);
        salt.setRequiredAmount(0);
        inventory[Item.salt.ordinal()] = salt;
        
        InventoryItem gold = new InventoryItem();
        gold.setDescription("Gold");
        gold.setQuantityInStock(0);
        gold.setRequiredAmount(2);
        inventory[Item.gold.ordinal()] = gold;

        InventoryItem silver = new InventoryItem();
        silver.setDescription("Silver");
        silver.setQuantityInStock(0);
        silver.setRequiredAmount(3);
        inventory[Item.silver.ordinal()] = silver;
        
        InventoryItem bow = new InventoryItem();
        bow.setDescription("Bow");
        bow.setQuantityInStock(0);
        bow.setRequiredAmount(1);
        inventory[Item.bow.ordinal()] = bow;
        
        InventoryItem arrow = new InventoryItem();
        arrow.setDescription("Arrow");
        arrow.setQuantityInStock(0);
        arrow.setRequiredAmount(1);
        inventory[Item.arrow.ordinal()] = arrow;
        
        InventoryItem sling = new InventoryItem();
        sling.setDescription("Sling");
        sling.setQuantityInStock(0);
        sling.setRequiredAmount(1);
        inventory[Item.sling.ordinal()] = sling;
        
   
        return inventory;
    }

    public static Location[][] getMapLocations() {
        return LDSScriptureGameTeam.getCurrentGame().getMap().getLocations();
    }

    public static InventoryItem[] getSortedInventoryList() {
        
        // get inventory list for the current game
        InventoryItem[] originalInventoryList = 
                LDSScriptureGameTeam.getCurrentGame().getInventory();
        
        // clone (make a copy) orignalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
       // using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        
        return inventoryList;
    }

    public static InventoryItem[] getInventory() {
        return LDSScriptureGameTeam.getCurrentGame().getInventory();
    }


}