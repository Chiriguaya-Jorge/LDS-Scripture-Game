/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import byui.cit260.ldsScriptureGame.control.GameControl;
import byui.cit260.ldsScriptureGame.model.Game;
import byui.cit260.ldsScriptureGame.model.InventoryItem;
import byui.cit260.ldsScriptureGame.model.Location;
import byui.cit260.ldsScriptureGame.model.Scene;
import lds.scripture.game.team.LDSScriptureGameTeam;
import byui.cit260.ldsScriptureGame.enums.Character;

import java.awt.Point;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Team Work
 * Individual Assignment Week 12 Jorge Chiriguaya List of actors report
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
            + "\n---------------------------------------------"
            + "\n| Game Menu                                 |"
            + "\n---------------------------------------------"
            + "\nV - View map"
            + "\nI - View list of items in inventory"
            + "\nA - View list of characters"
            + "\nS - View travel's progress"
            + "\nL - View location"
            + "\nM - Move character to a new location"
            + "\nE - Estimate the resources needed for trip"
            + "\nB - Design bags to hold resources"
            + "\nR - Find resources at location"
            + "\nD - Deliver resources to bag"
            + "\nJ - Travel back"
            + "\nH - Display help menu"
            + "\nQ - Quit"
            + "\n---------------------------------------------");
    }
  
    
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered
     
        
        switch (choice) {
            case 'V': // Travel to new location
                this.displayMap(); 
                break;
            case 'I': // View list of items in inventory
                this.viewInventory(); 
                break;
            case 'A': // View list of actors
                this.viewCharacters(); 
                break;
            case 'S': // View the ship's status
                this.viewTravelProgress(); 
                break;
            case 'L': // View description of location
                this.viewLocation(); 
                break;    
            case 'M': // Move actor to new location
                this.moveToLocation(); 
                break;                
            case 'E': // Estimate the resource needed
                this.estimateResources();
                break;
            case 'B': // Design barrels
                this.bagCreation(); 
                break;
            case 'R': // Harvest resource
                this.findResources(); 
                break;
            case 'D': // Deliver resource
                this.deliverResources(); 
                break;
            case 'J': // Launch ship
                this.travel();      
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    public void displayMap() {
        int lineLength = 0;
        
        // get the map for the game
        Location[][] locations = GameControl.getMapLocations();
        int noColumns = locations[0].length; // get number columns in row
        
        this.printTitle(noColumns, "THE PLATES OF BRASS");
        this.printColumnHeaders(noColumns);
        
        for (int i = 0; i < locations.length; i++) {    
            Location[] rowLocations = locations[i];
            this.printRowDivider(noColumns);
            System.out.println(); // move down one i
            if (i < 9)
                System.out.print(" " + (i+1));
            else 
                System.out.print(i+1);
            
            // for every column in the row
            for (int column = 0; column < noColumns; column++) {
                System.out.print("|"); // print column divider
                Location location = rowLocations[column];
                if (location != null && location.isVisited()) { // if location is visited 
                    
                    Scene scene = location.getScene();
                    if (scene != null)
                        System.out.print(scene.getMapSymbol());
                    else
                        System.out.print("    ");
                }
                else {
                    System.out.print(" ?? ");
                }      
            }
            
            System.out.print("|"); // print column divider
        }
        
        this.printRowDivider(noColumns);
    }  

    private void moveToLocation() {
        MoveCharacterView moveCharacterView = new MoveCharacterView();     
        moveCharacterView.display();     
    }

    private void viewLocation() {
        LocationView locationView = new LocationView();
        locationView.display();
    }

    private void estimateResources() {
        System.out.println("*** estimateResources stub function called ***");        
    }

    private void bagCreation() {
        BagCreationView bagCreationView = new BagCreationView();
        bagCreationView.display();
    }
    
    private void findResources() {
        System.out.println("*** findResources stub function called ***");        
    }

    private void displayCharacters() {
        this.viewCharacters(LDSScriptureGameTeam.getOutFile());
    }
    private void viewCharacters(PrintWriter out) {
        Game game = LDSScriptureGameTeam.getCurrentGame();
        out.println("\n    LIST OF ACTORS");
        StringBuilder line = new StringBuilder("                                                          ");
        line.insert(0, "NAME"); 
        line.insert(15, "LOCATION");
        out.println(line.toString());
        
        Character[] characters = Character.values();
        for (Character character : characters) {
            Point coordinates = game.getCharactersLocation()[character.ordinal()];
            line = new StringBuilder("                                                          ");
            line.insert(0, character.name());
            int row = coordinates.x+1;
            int column = coordinates.y+1;
            line.insert(17,  + row + ", " + column);
            out.println(line.toString());
        }
        
    }
    
    private void viewCharacters() {
        System.out.println("*** viewCharacters stub function called ***");       
    }

    private void viewTravelProgress() {
        System.out.println("*** viewtravelProgress stub function called ***");        
    }
    
    
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display(); 
    }

    private void viewInventory() {
        // get the sorted list of inventory items for the current game
        Game game = LDSScriptureGameTeam.getCurrentGame();
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\n        LIST OF INVENTORY ITEMS");
        StringBuilder line = new StringBuilder("                                                          ");
        line.insert(0, "DESCRIPTION"); 
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        
        // for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            line = new StringBuilder("                                                          ");
            line.insert(0, inventoryItem.getDescription());
            line.insert(23, inventoryItem.getRequiredAmount());
            line.insert(33, inventoryItem.getQuantityInStock());
            
            // DISPLAY the description, the required amount and amount in stock
            System.out.println(line.toString());
        }   
    }
    
    private void travel() {
        System.out.println("*** travel stub function called ***");        
    }


    private void printColumnHeaders(int noOfColumns) {
        for (int i = 1; i < noOfColumns+1; i++) {
            if (i < 10) {
                System.out.print("   " + i + " ");
            }
            else {
                System.out.print("  " + i + " ");
            }
        }
    }

    private void printRowDivider(int noColumns) {
        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < noColumns; i++) { // print row divider
                System.out.print("-----");
        }
        System.out.print("-");
    }

    private void printTitle(int noOfColumns, String title) {
        
        int titleLength = title.length();
        int lineLength = noOfColumns * 5 + 3;
        int startPosition = (lineLength / 2) - (titleLength / 2);
        System.out.println("\n");
        for (int i = 0; i < startPosition; i++) {
            System.out.print(" ");  
        }
        System.out.print(title);
        System.out.println("\n");
        
    }

    private void deliverResources() {
        System.out.println("*** deliverResources function called ***");        
    }
    
    public void printReport() {
        // get the filepath and name of the file
        this.console.println("\nEnter the file path where the report is to be saved");
        
        String filePath = this.getInput();
        if (filePath == null) {
            return;
        }
        
        // Create a new printwriter
        try (PrintWriter reportFile = new PrintWriter(filePath)) {
            
            
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String dateTime = formatter.format(currentTime);
            
            reportFile.println("Report printed: " + dateTime);
            
            this.viewMap(reportFile);
            
            reportFile.println();
            this.viewInventory(reportFile);

            reportFile.println();
            this.viewCharacters(reportFile); 
            
            LDSScriptureGameTeam.getOutFile().println(
                    "\n*** Report printed to file: " + filePath + " ***");
            
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", "Error writing to game report file. "
                    + "\n\t" + ex.getMessage());
        }

    }
}
