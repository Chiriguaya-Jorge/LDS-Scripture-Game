/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.control;

import byui.cit260.ldsScriptureGame.enums.Character;
import byui.cit260.ldsScriptureGame.enums.Item;
import byui.cit260.ldsScriptureGame.enums.SceneGroup;
import byui.cit260.ldsScriptureGame.enums.SceneType;
import byui.cit260.ldsScriptureGame.enums.Direction;
import byui.cit260.ldsScriptureGame.model.Game;
import byui.cit260.ldsScriptureGame.model.InventoryItem;
import byui.cit260.ldsScriptureGame.model.Location;
import byui.cit260.ldsScriptureGame.model.Map;
import byui.cit260.ldsScriptureGame.model.Scene;
import byui.cit260.ldsScriptureGame.model.ResourceScene;
import byui.cit260.ldsScriptureGame.exceptions.MapControlException;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import lds.scripture.game.team.LDSScriptureGameTeam;

/**
 *
 * @author Team Work
 */
public class MapControl {

    public static Map createMap() throws MapControlException  {
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
    
    public static void moveCharactersToStartingLocation(Map map, Character[] characters) 
                            throws MapControlException{
        // for every character
        Game game = LDSScriptureGameTeam.getCurrentGame();
        for (Character character : characters) {
            Point coordinates = new Point(0, 2);
            game.getCharactersLocation()[character.ordinal()] = new Point();
            MapControl.moveCharacterToLocation(game, character, coordinates);
        }
    }    
    
    public static void moveCharacterToLocation(Game game, Character character, Point coordinates)
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
    public static Point moveActor(Character character, Direction direction, int distance) 
                            throws MapControlException {
        
        Point blockedLocation = null;
        
        if (character == null  || direction == null  || distance < 1) {
            throw new InvalidParameterException("character, direction or distance is invalid");
        }
        
        Game game = LDSScriptureGameTeam.getCurrentGame();    
        Map map = LDSScriptureGameTeam.getCurrentGame().getMap();
        Point currentPosition = game.getCharactersLocation()[character.ordinal()];
        Point newPosition = null;
        
        if (currentPosition == null) {
            throw new MapControlException("Character is currently is not assigned "
                                          + "to a location");
        }
        
        int currentRow = currentPosition.x;
        int currentColumn = currentPosition.y;

        if (currentRow < 0  || currentRow >= map.getNoOfRows() ||
            currentColumn < 0  || currentColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Character is currently in an invalid "
                                          + "location");
        }
        
        // get new position
        int newRow = currentPosition.x + (direction.getxIncrement() * distance);
        int newColumn = currentPosition.y + (direction.getyIncrement() * distance);
        
                   
        if (newRow < 0  || newRow >= map.getNoOfRows() ||
            newColumn < 0  || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Trying to move to a location "
                                          + "outside bounds of the map");
        }  
        
        
        // Check to see if the path is blocked
        boolean blocked = false;
        Location[][] locations = map.getLocations();
        
        int noOfRows = (newRow - currentRow) * direction.getxIncrement();
        int row = currentRow + direction.getxIncrement();      
        for (int i = 0; i < noOfRows; i++ ) {
            locations[row][currentColumn].setVisited(true);
            
            if (locations[row][currentColumn].getScene().isBlocked()){   
                blocked = true;
                newRow = row - direction.getxIncrement();
                blockedLocation = new Point(row+1, currentColumn+1);
                break;
            }
            
            row += direction.getxIncrement();
        }
        
        
        int noOfColumns = (newColumn - currentColumn) * direction.getyIncrement();
        int column = currentColumn + direction.getyIncrement();       
        for (int i = 0; i < noOfColumns; i++ ) {
            locations[currentRow][column].setVisited(true);

            if (locations[currentRow][column].getScene().isBlocked()){ 
                blocked = true;
                newColumn = column - direction.getyIncrement();
                blockedLocation = new Point(currentRow+1, column+1);
                break;
            }  
            column += direction.getyIncrement();
        } 
        
        
        if (currentRow != newRow || currentColumn != newColumn) {
            Location currentLocation = map.getLocations()[currentRow][currentColumn];
            currentLocation.removeCharacter(character); // remove actor from old location

            // set actor to new location
            newPosition = new Point(newRow, newColumn);
            MapControl.moveCharacterToLocation(game, character, newPosition);
        }

        
        return blockedLocation;
    }    
    
    public static Location getLocation(Point coordinates) {
        return LDSScriptureGameTeam.getCurrentGame().getMap().getLocations()[coordinates.x-1][coordinates.y-1];
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        // start point
        locations[0][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
      
        
        
        HashMap<String, ArrayList<Point>> sceneLocations =  
                new HashMap<String, ArrayList<Point>>();
        // create list of scenes to be assigned to locations
         ArrayList<Point> leatherCoordinates = new ArrayList<Point>();
        leatherCoordinates.add(new Point(1,8));
        leatherCoordinates.add(new Point(2,8));
        leatherCoordinates.add(new Point(1,9));
        leatherCoordinates.add(new Point(2,9));
        leatherCoordinates.add(new Point(2,13));
        leatherCoordinates.add(new Point(3,13));
        leatherCoordinates.add(new Point(4,13));
        leatherCoordinates.add(new Point(5,13));
        leatherCoordinates.add(new Point(3,14));
        leatherCoordinates.add(new Point(4,14));
        leatherCoordinates.add(new Point(9,16));
        leatherCoordinates.add(new Point(10,16));
        leatherCoordinates.add(new Point(9,17));
        leatherCoordinates.add(new Point(11,14));
        leatherCoordinates.add(new Point(12,5));
        sceneLocations.put("LEATHER", leatherCoordinates);
        
        // water
        locations[11][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[9][14].setScene(scenes[SceneType.water.ordinal()]);
        locations[12][6].setScene(scenes[SceneType.leather.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.leather.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.leather.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.leather.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.leather.ordinal()]);
        locations[2][13].setScene(scenes[SceneType.leather.ordinal()]);
        locations[3][12].setScene(scenes[SceneType.leather.ordinal()]);
        locations[3][13].setScene(scenes[SceneType.leather.ordinal()]);
        locations[3][14].setScene(scenes[SceneType.leather.ordinal()]);
        locations[4][13].setScene(scenes[SceneType.leather.ordinal()]);
        locations[4][14].setScene(scenes[SceneType.leather.ordinal()]);
        locations[5][13].setScene(scenes[SceneType.leather.ordinal()]);
        locations[9][16].setScene(scenes[SceneType.leather.ordinal()]);
        locations[9][17].setScene(scenes[SceneType.leather.ordinal()]);
        locations[10][16].setScene(scenes[SceneType.leather.ordinal()]);
        locations[11][6].setScene(scenes[SceneType.leather.ordinal()]);
        locations[12][5].setScene(scenes[SceneType.leather.ordinal()]);
        locations[11][14].setScene(scenes[SceneType.leather.ordinal()]);
        locations[9][10].setScene(scenes[SceneType.riverCrossing.ordinal()]);
        locations[10][6].setScene(scenes[SceneType.salt.ordinal()]);
    }
}