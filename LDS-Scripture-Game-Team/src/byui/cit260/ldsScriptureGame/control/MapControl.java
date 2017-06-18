/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.control;

import byui.cit260.ldsScriptureGame.model.Character;
import byui.cit260.ldsScriptureGame.model.Item;
import byui.cit260.ldsScriptureGame.model.Game;
import byui.cit260.ldsScriptureGame.model.InventoryItem;
import byui.cit260.ldsScriptureGame.model.Location;
import byui.cit260.ldsScriptureGame.model.Map;
import byui.cit260.ldsScriptureGame.model.Scene;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import lds.scripture.game.team.LDSScriptureGameTeam;

/**
 *
 * @author Jorge Chiriguaya
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
    
    public static Location getLocation(Point coordinates) {
        return LDSScriptureGameTeam.getCurrentGame().getMap().getLocations()[coordinates.x-1][coordinates.y-1];
    }
    
    public static int moveCharacterToLocation(Character character, Point coordinates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static Scene[] createScenes() {
        return null;
     
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        Point coordinate;
        
        HashMap<String, ArrayList<Point>> sceneLocations =  new HashMap<String, ArrayList<Point>>();
        
        // create list of scenes to be assigned to locations
         
        
        
    }
}