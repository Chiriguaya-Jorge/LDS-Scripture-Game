/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import byui.cit260.ldsScriptureGame.control.MapControl;
import byui.cit260.ldsScriptureGame.enums.Character;
import byui.cit260.ldsScriptureGame.enums.Direction;
import byui.cit260.ldsScriptureGame.exceptions.MapControlException;
import byui.cit260.ldsScriptureGame.exceptions.ViewException;
import byui.cit260.ldsScriptureGame.model.Game;
import lds.scripture.game.team.LDSScriptureGameTeam;
import java.awt.Point;

/**
 *
 * @author Jorge Chiriguaya Week 13
 */
public class MoveCharacterView extends View {

    public MoveCharacterView() {
        super("\n"
             + "\n-------------------------------------------"
             + "\n| Select character to move                |"
             + "\n-------------------------------------------"
             + "\nA - Laman"
             + "\nE - Lemuel"
             + "\nN - Nephi"
             + "\nM - Sam"
             + "\nZ - Zoram"
             + "\nQ - Quit"
             + "\n------------------------------------------");
    }

    public boolean doAction(String obj) {
        
        Character character; 
        Game game = LDSScriptureGameTeam.getCurrentGame();

        String choice = (String) obj;
        choice = choice.trim().toUpperCase(); // trim blanks and uppercase

        // check for valid character
        switch (choice) {
            case "L":
                character = Character.Lehi;
                break;
            case "A":
                character = Character.Laman;
                break;  
            case "E":
                character = Character.Lemuel;;
                break; 
            case "N":
                character = Character.Nephi;
                break; 
            case "M":
                character = Character.Sam;
                break;
            case "Z":
                character = Character.Zoram;
                break;
            case "Q":
                return true;
            default:
                
                ErrorView.display("MoveCharacterView", "Invalid selection");
                return false;
        }


        boolean done = false;
        do {
            this.console.println("\nYou can move up (U), down(D), left(L) or right (R)");
            try {
                // prompt for and get the row and column numbers
                this.console.println("\nEnter the direction and distance to move (e.g. U 2) ");
                Movement movement = this.getCoordinates(); // get the row and column
                if (movement == null) // entered "Q" to quit
                    break;
                
                // move actor to specified location
                Point blockedLocation = MapControl.moveActor(character, 
                                                       movement.direction, 
                                                       movement.distance);
                
                Point coordinates = game.getCharactersLocation()[character.ordinal()];
                Point newPosition = new Point(coordinates.x + 1, coordinates.y + 1);
      
                String locationDescription;
                String message = "";
                if (blockedLocation != null) {
                    locationDescription = MapControl.getLocation(blockedLocation).getScene().getDescription();
                    message = "The path was blocked at position " 
                                    +   blockedLocation.x + ", " + blockedLocation.y + ".\n"
                                    +   this.getBlockedMessage(locationDescription)
                                    +   "\n\n" + character + " is currently in position " 
                                    +   newPosition.x + ", " + newPosition.y;  
                    this.console.println(message);
                    
                }
                else {
                    locationDescription = MapControl.getLocation(newPosition).getScene().getDescription();
                    message = character + " was successfully moved to position " 
                            + newPosition.x + ", " + newPosition.y + ".\n"
                            + this.getBlockedMessage(locationDescription);
                    this.console.println(message);                
                }
                
                done = true;
            } catch (ViewException | MapControlException ex) {
                    ErrorView.display("MoveActorView", ex.getMessage());
            }       
        } while (!done);

        return false;  
    }

    public Movement getCoordinates() throws ViewException {
        Movement movement = null;
        
        String value = this.getInput();
        value = value.trim().toUpperCase();
        if (value.equals("Q"))
            return null;
        
                //tokenize values int string
        String[] values = value.split(" ");
        
        
        if (values.length < 2) {
            ErrorView.display(this.getClass().getName(),
                              "You must enter both a direction and distance.");
            return null;
        }
        
        // get the direction
        Direction direction;
        switch (value.charAt(0)) {
            case 'U' : direction = Direction.U;
                break;
            case 'D' : direction = Direction.D;
                break;
            case 'L' : direction = Direction.L;
                break;
            case 'R' : direction = Direction.R;
                break;
            default: 
                ErrorView.display(this.getClass().getName(),
                                 "The direction must be U, D, L or R");
                return null;
        }

        // convert the distance to a number
        try {
            int distance = Integer.parseInt(values[1]);
            if (distance < 1) {
                ErrorView.display(this.getClass().getName(),
                                 "The distance must be greater than zero.");
                return null;
            }
            
            movement = new Movement(direction, distance);
        }     
        catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),
                             "The distance is not a  number.");
        }     
        
        return movement;
    }
    
    private class Movement {
        
        Direction direction;
        int distance;
        
        public Movement(Direction direction, int distance) {
            this.direction = direction;
            this.distance = distance;
        }
    }
    
}
