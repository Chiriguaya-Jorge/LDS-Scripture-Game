/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.control.CharacterControl;
import java.util.Scanner;

/**
 *
 * @author Karla
 */
public class FightBeastView {
    private String message;
   
    
    public FightBeastView() {
     this.message = ("\n"
            + "\n------------------------"
            + "\n| Fight the beast"
            + "\n------------------------");}       

     public void displayFightBeastView() {
        public boolean doAction(double characterDamage, double numberOfHits) {
            
        CharacterControl characterControl = new CharacterControl();
        double totalDamage = characterControl.calcCharacterLife(characterDamage, numberOfHits);
        if (totalDamage == 0 ) {
            System.out.println("\n Damage should be between 1 and 5" + 
                    "Number of hits should be between 1 and 20, Please try again");
        }
        else {
             System.out.println("\n Great, you have beaten the beast!" +
                     "\n your total damage was: " + totalDamage);
        }
       return true;
        }
     
 public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;

        // while a valid name has not been retrieved
        while (!valid) {

            // get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) { // blank value entered
                System.out.println("\n*** Invalid selection *** Please, try again");
                continue;
            }
            
            break;
        }

        return selection; // return the name        
    }
     
      public void display() {
        String value;
        boolean done = false;
        
        do { 
            System.out.println(this.message); // display the prompt message
            
            double characterDamage = 0.0;
            double numberOfHits = 0.0;
            
            System.out.println("\nPlease enter the height of the barrel");
            characterDamage = Double.parseDouble(getInput());                                                                     

            System.out.println("\nPlease enter the diameter of the barrel");
            numberOfHits = Double.parseDouble(getInput());    
           
            done = this.doAction(characterDamage, numberOfHits); // do action based on selection        
        } while (!done);
       
 
   
    }
    
}

    