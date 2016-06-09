/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.control.GameControl;
import cit260.escapeFromInsanityIsland.model.Player;
import java.util.Scanner;

/**
 *
 * @author Karla
 */
public class StartProgramView {

        
    private String promptMessage;

    public StartProgramView () {

        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
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
    
      
 
 public void displayStartProgramView() {
    
   
    boolean done = false; // set flag to not done
    do{
        //prompt for and get players name
        String playersName = this.getPlayersName();
        if (playersName.toUpperCase().equals("Q")) //User wants to quit
            return; //exit the game
        
        //do he requested action and display the next view
        done = this.doAction(playersName);
     } while (!done);
 }
    
    private String getPlayersName() {
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
        return value; //returns the value entered
    }
         
 private boolean doAction(String playersName) {
       
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
            + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control funtion
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;}
        //display next view
        this.displayNextView(player);
        return true; // sucess!  
   }

    private void displayNextView(Player player) {
    // display a custom welcome message
    System.out.println("\n=================================="
            + "\n Welcome to the game " + player.getName()
            + "\n We hope you have a lot of fun!"
            + "\n==========================================="
            );
    
    // create MainMenuView OBJECT
    MainMenuView mainMenuView = new MainMenuView();
     
    mainMenuView.displayMainMenuView();
    }

    
        
        }
   
       
    

    


 