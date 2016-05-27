/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.from.insanity.island;

import cit260.escapeFromInsanityIsland.model.Game;
import cit260.escapeFromInsanityIsland.model.Location;
import cit260.escapeFromInsanityIsland.model.Map;
import cit260.escapeFromInsanityIsland.model.Player;
import cit260.escapeFromInsanityIsland.model.Character;
import cit260.escapeFromInsanityIsland.model.Inventory;
import cit260.escapeFromInsanityIsland.model.Scene;
/**
 *
 * @author Karla
 */
public class EscapeFromInsanityIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
    
    
    playerOne.setName("Karla Cruz");
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    
   //game class
        Game saveGame = new Game();
        
    saveGame.setNoPeople("X");
    String gameInfo = saveGame.toString();
    System.out.println(gameInfo);
    
    
    //Map class
        Map rowOne = new Map();
        Map columnOne = new Map();
        
    rowOne.setRowCount(true);
    String mapInfo = rowOne.toString();
    System.out.print(mapInfo);
        
    columnOne.setRowCount(true);
    String mapCoordinates = columnOne.toString();
    System.out.print(mapCoordinates);
        
    //Location class
        Location coordinatesX = new Location();
    
   coordinatesX.setCoordinates(true);
   String coordinatesInfo = coordinatesX.toString();
   System.out.print(true);
   
  
   Character characterName = new Character();
   Character characterLocation = new Character();
   Character characterLife = new Character();
   Character beastDamage = new Character();
   
   characterName.setName("snake");
   String characterNameInfo = characterName.toString();
   System.out.println(characterNameInfo);
   
   characterLocation.setLocation(true);
   String characterLocationInfo = characterLocation.toString();
   System.out.print(characterLocationInfo);
   
   characterLife.setCharacterlife(0);
   String characterLifeInfo = characterLife.toString();
   System.out.print(0);
   
   beastDamage.setBeastDamage(30);
   String beastDamageInfo = beastDamage.toString();
   System.out.print(0);
   
    // Scene class
    
        Scene nameOne = new Scene();
        
    nameOne.setName("Beach");
    String nameInfo = nameOne.toString();
    System.out.println(nameInfo);
    
    //still need to code scene sub-classes.
    
        Inventory inventoryList;
        inventoryList = new Inventory();
        
    inventoryList.setInventoryList(true);
    String inventoryInfo = inventoryList.toString();
    System.out.print(true);
     
    }
    
}
