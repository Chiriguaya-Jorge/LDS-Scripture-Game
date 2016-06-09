/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import java.util.Scanner;

/**
 *
 * @author Karla
 */
public class StartGameView {
    private String menu;
    private String promptMessage ;
    
    public StartGameView(){
        
        this.promptMessage = "\nPlese select your mood from the menu: ";
        
        this.menu = "\nQ - Quit"
                + "\n"
                + "\n----------------------------------"
                + "\n How are you feeling?"
                + "\n ---------------------------------"
                + "\nC - Confused"
                + "\nA - Angry"
                + "\nW - Worried"
                + "\nH - Happy"
                + "\n----------------------------------";
                }
    
    
   public void displayStartGameView() {
        boolean done = false; //set flag to not done
        do {
            //promp for and gets players name
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("Q")) //USER WANTS TO QUIT
                    return; //exit the game
            
            //do the requested action adnd display the next view
            done = this.doAction(menuOption);
        } while (!done); 
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false;  //initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();//getnext line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1 ){ //if value is blank
                System.out.println("\nInvalid valude: value cannot be blank");
                continue;
                            }
            break;
        }
        return value; //returns the value enteredjsn
        }

    private boolean doAction(String menuOption) {
       menuOption = menuOption.toUpperCase(); //converts to upper case
       
       switch (menuOption){
           case "C": //confused
               this.confused();
               
           case "A": //angry
               this.angry();
               
           case "W": // worried
               this.worried();
            
           case "H": //happy
               this.happy();
               break;
              
           default:
               System.out.println("\nInvalid selection *** Try again");
               break;     
       }
       return false;
        }

    private void confused() {
        // int value = ????  
        System.out.println("\n***confused() stub function called");
    }

    private void angry() {
        System.out.println("\n** angry() stub function called");
    }

    private void worried() {
        System.out.println("\n** Invalid() stub function called");
    }

    private void happy() {
        System.out.println("\n*** happy() stub function called");
    }

   
    
    
}
