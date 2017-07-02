/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import byui.cit260.ldsScriptureGame.control.MapControl;
import byui.cit260.ldsScriptureGame.enums.Character;
import byui.cit260.ldsScriptureGame.exceptions.MapControlException;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MoveCharacterView extends View {

    public MoveCharacterView() {
        System.out.println("\n"
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

    
    public boolean doAction(String choice) {
        Character character = null; 

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
                System.out.println("Invalid selection");
                return false;
        }


        boolean done = false;
        do {

            // prompt for and get the row and column numbers
            System.out.println("\nEnter the row and column number of the location (e.g., 1 3)");
            Point coordinates = this.getCoordinates(); // get the row and column
            if (coordinates == null) // entered "Q" to quit
                break;

            // move character to specified location
            try {
            MapControl.moveCharacterToLocation(character, coordinates);
            } catch (MapControlException me) {
                System.out.println(me.getMessage());
            }
           
            System.out.println("\n" + character + 
                               " was successfully moved to location: " + 
                               coordinates.x + ", " + coordinates.y);
            done = true;

        } while (!done);

        return false;  
    }

    public Point getCoordinates() {

        String value = this.getInput();
        value = value.trim().toUpperCase();
        if (value.equals("Q"))
            return null;

        //tokenize values int string
        String[] values = value.split(" ");

        if (values.length < 2) {
            System.out.println("You must enter both a row and column number.");
            return null;
        }

        // parse out row and column numbers
        int row = Integer.parseInt(values[0]);
        int column = Integer.parseInt(values[1]);
        return new Point(row, column);

    }
    
}
