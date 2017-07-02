/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.control;

import byui.cit260.ldsScriptureGame.enums.Character;
import byui.cit260.ldsScriptureGame.enums.Item;
import byui.cit260.ldsScriptureGame.model.Game;
import byui.cit260.ldsScriptureGame.model.InventoryItem;
import byui.cit260.ldsScriptureGame.model.Location;
import byui.cit260.ldsScriptureGame.model.Map;
import byui.cit260.ldsScriptureGame.model.Scene;
import byui.cit260.ldsScriptureGame.enums.SceneType;
import byui.cit260.ldsScriptureGame.model.ResourceScene;
import byui.cit260.ldsScriptureGame.exceptions.MapControlException;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import lds.scripture.game.team.LDSScriptureGameTeam;

/**
 *
 * @author Team Work
 */
public class MapControl {

    public static Map createMap() {
        // create the map
        Map map = new Map(20, 20);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes(); 
        
        // assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes); 
        
        return map;
    }
   
    private static Scene[] createScenes() {
        Game game = LDSScriptureGameTeam.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
      
        
        Scene riverScene = new Scene();
        riverScene.setDescription(
                  "\nYou have come to a river. It is too deep to cross here.");
        riverScene.setMapSymbol("}}}}");
        riverScene.setBlocked(true);
        riverScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.river.ordinal()] = riverScene;
        
        Scene sandyDesert = new Scene();
        sandyDesert.setBlocked(false);
        sandyDesert.setDescription(
                  "\nYou have wandered into the dry sandy desert. Very little "
                + "\ngrows here.");
        sandyDesert.setMapSymbol("::::");
        sandyDesert.setTravelTime(20);
        scenes[SceneType.desert.ordinal()] = sandyDesert;
               
        Scene savana = new Scene();
        savana.setBlocked(false);
        savana.setDescription(
                  "\nYou have entered into the wilderness.");
        savana.setMapSymbol(",,,,");
        savana.setTravelTime(15);
        scenes[SceneType.wilderness.ordinal()] = savana;
        
        Scene riverCrossing = new Scene();
        riverCrossing.setBlocked(false);
        riverCrossing.setDescription(
                  "\nThe river is shallow here. It is a good place to cross. "
                + "\nYou might even think about building a bridge here.");
        riverCrossing.setMapSymbol("=}{=");
        riverCrossing.setTravelTime(20);
        scenes[SceneType.riverCrossing.ordinal()] = riverCrossing;
        
        ResourceScene silver = new ResourceScene();
                silver.setBlocked(false);
        silver.setDescription(
                    "\nThere is a lot of silver here at home.");
                silver.setBlocked(false);
        silver.setMapSymbol(" IR ");
        silver.setTravelTime(20);
        silver.setAmountOfResource(100);
        silver.setResourceType(Item.silver);
        scenes[SceneType.silver.ordinal()] = silver;        
        
        ResourceScene water = new ResourceScene();
                water.setBlocked(false);
        water.setDescription(
                  "\nThat river can give us a lot of water for our journey");
        water.setMapSymbol(" RW ");
        water.setTravelTime(15);
        water.setAmountOfResource(30);
        water.setResourceType(Item.water);
        water.setResourceType(Item.water);
        scenes[SceneType.water.ordinal()] = water;
        
        ResourceScene salt = new ResourceScene();
                salt.setBlocked(false);
        salt.setDescription(
                  "\nYou have found a cave full of interesting salt formations.");
        salt.setMapSymbol(" SA ");
        salt.setTravelTime(15);
        salt.setAmountOfResource(60);
        salt.setResourceType(Item.salt);
        scenes[SceneType.salt.ordinal()] = salt;
     
        return scenes;
    }
    
    public static void moveCharactersToStartingLocation(Map map) 
                            throws MapControlException{
        // for every character
        Character[] characters = Character.values();

        for (Character character : characters) {
            Point coordinates = character.getCoordinates();
            MapControl.moveCharacterToLocation(character, coordinates);
        }
    }    
    
    public static void moveCharacterToLocation(Character character, Point coordinates)
                           throws MapControlException {
                                   
        Map map = LDSScriptureGameTeam.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0  || newRow >= map.getNoOfRows() ||
            newColumn < 0  || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move character to location "
                                          + coordinates.x + ", " + coordinates.y
                                          + " because that location is outside "
                                          + " the bounds of the map.");
        }
        
    }
    
    public static Location getLocation(Point coordinates) {
        return LDSScriptureGameTeam.getCurrentGame().getMap().getLocations()[coordinates.x-1][coordinates.y-1];
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        Point coordinate;
        
        HashMap<String, ArrayList<Point>> sceneLocations =  new HashMap<String, ArrayList<Point>>();
        
        // create list of scenes to be assigned to locations
         
        
        
    }
}