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
public class HelpMenuView {
     private String menu;
     private String promptMessage;
     
    
     
    public HelpMenuView(){
        
        this.promptMessage = "\nPlese select an option: ";
        
        this.menu = "\nQ - Quit"
                + "\n"
                + "\n----------------------------------"
                + "\n Help Menu                        "
                + "\n ---------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nT - Tools available to construct"
                + "\nC - Construct tools"
                + "\nV - View map"
                + "\nA - Avoid traps/beast"
                + "\nQ - Quit game"
                + "\n----------------------------------";
                }
    
    
   public void displayMainMenuView() {
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
           case "G": // explains goal of game
               this.goalOfGame();
               
           case "M": //how to move
               this.move();
               
           case "T": // tools availavle to construct
               this.toolsAvailable();
            
           case "C": //constructin tools
               this.constructTools();
               
           case "V": //View map
               this.viewMap();
               
           case "A": //avoid traps and beast
               this.avoidTraps();
               break;
              
           default:
               System.out.println("\nInvalid selection *** Try again");
               break;     
       }
       return false;
        }

    private void goalOfGame() {
       System.out.println(
       "\n\n*********************************************"
       + "\n* Welcome to Insanity Island, you woke up in this     *"
       + "\n* island but you can't remember anything but your     *"
       + "\n* name, now you need to find a way to escape.         *"
       + "\n*                                                     *"
       + "\n* You have to explore the island and look for items   *"
       + "\n* to create tools and build a ship to get out of here *"
       + "\n* Be extra careful because there are dangerous traps  *"
       + "\n* and wild beasts that will try to eat you alive, you *"
       + "\n* will have to create weapons and even medicine in    *"
       + "\n* order to survive.                                   *"
       + "\n*                                                     *"
       + "\n* Once you have found all the items to build the ship *"
       + "\n* you need to go to the ship bay and start building   *"
       + "\n* your ship, there is not much time so you have to    *"
       + "\n* hurry.                                              *" 
       + "\n*                                                     *"
       + "\n* Good luck and have fun in this adventure.           *"
       + "\n*                                                     *"
       + "\n*******************************************************"
       );
    }

    private void move() {
        System.out.println("*** startExistinGame function called"); 
    }

    private void toolsAvailable() {
        System.out.println("*** toolsAvailable function called"); 
    }

    private void constructTools() {
        System.out.println("*** constructTools function called"); 
    }

    private void viewMap() {
        System.out.println("*** viewMap function called"); 
    }

    private void avoidTraps() {
        System.out.println("*** avoidTraps function called"); 
    }

    
    
}
