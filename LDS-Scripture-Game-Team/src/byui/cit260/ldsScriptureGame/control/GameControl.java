/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.control;

import byui.cit260.ldsScriptureGame.model.Player;
import byui.cit260.ldsScriptureGame.model.Game;
import lds.scripture.game.team.LDSScriptureGameTeam;
import byui.cit260.ldsScriptureGame.enums.Item;
import byui.cit260.ldsScriptureGame.model.InventoryItem;
import byui.cit260.ldsScriptureGame.model.Location;
import byui.cit260.ldsScriptureGame.model.Map;
import byui.cit260.ldsScriptureGame.model.Scene;
import byui.cit260.ldsScriptureGame.enums.SceneType;
import byui.cit260.ldsScriptureGame.exceptions.MapControlException;
import byui.cit260.ldsScriptureGame.exceptions.GameControlException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.InvalidParameterException;

/**
 *
 * @author Team Work Week 12
 */
public class GameControl {

    public static Player createPlayer(String name) {

        Player player = new Player();
        player.setName(name);
        
        LDSScriptureGameTeam.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) 
            throws MapControlException {
        Game game = new Game(); // create new game
       LDSScriptureGameTeam.setCurrentGame(game); // save in LDSScriptureGameTeam
       
       game.setPlayer(player); // save player in game
       
       // create the inventory list and save in the game
       InventoryItem[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
        
       Map map = MapControl.createMap(); // create and initialize new map
       game.setMap(map); // save map in game

       // move actors to starting position in the map
              
       MapControl.moveCharactersToStartingLocation(map);

    }
    
    public static InventoryItem[] createInventoryList() {
        // created array(list) of inventory items    
        InventoryItem[] inventory = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
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
        gold.setRequiredAmount(20);
        inventory[Item.gold.ordinal()] = gold;

        InventoryItem silver = new InventoryItem();
        silver.setDescription("Silver");
        silver.setQuantityInStock(0);
        silver.setRequiredAmount(30);
        inventory[Item.silver.ordinal()] = silver;
        
        InventoryItem bow = new InventoryItem();
        bow.setDescription("Bow");
        bow.setQuantityInStock(0);
        bow.setRequiredAmount(5);
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
        
        InventoryItem sword = new InventoryItem();
        sword.setDescription("Sword");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(1);
        inventory[Item.sword.ordinal()] = sword;
        
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

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
       
        //start point
        locations[0][0].setScene(scenes[SceneType.redSea.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.lehisTent.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.redSea.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.camel.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.preparation.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.desert.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.desert.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.desert.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.desert.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.desert.ordinal()]);
        locations[10][10].setScene(scenes[SceneType.desert.ordinal()]);
        locations[11][11].setScene(scenes[SceneType.desert.ordinal()]);
        locations[12][12].setScene(scenes[SceneType.desert.ordinal()]);
        locations[13][13].setScene(scenes[SceneType.desert.ordinal()]);
        locations[14][14].setScene(scenes[SceneType.desert.ordinal()]);
        locations[15][15].setScene(scenes[SceneType.oath.ordinal()]);
        locations[16][16].setScene(scenes[SceneType.outTheWalls.ordinal()]);
        locations[17][17].setScene(scenes[SceneType.jerusalem.ordinal()]);
        locations[18][18].setScene(scenes[SceneType.desert.ordinal()]);
        locations[19][19].setScene(scenes[SceneType.desert.ordinal()]);

        
    }

    public static void saveGame(Game game, String filepath) 
            throws GameControlException {

        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        } 
    }

     public static void getSavedGame(String filepath) 
                        throws GameControlException {
        Game game = null;

        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject(); // read the game object from file
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }

       // close the outuput file
       LDSScriptureGameTeam.setCurrentGame(game); // save in CuriousWorkmanship
    }
     
}