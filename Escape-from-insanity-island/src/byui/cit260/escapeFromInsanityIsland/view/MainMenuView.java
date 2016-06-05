/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.control.GameControl;
import escape.from.insanity.island.EscapeFromInsanityIsland;
import java.util.Scanner;

/**
 *
 * @author Karla
 */
public class MainMenuView {
    
    private String menu;
    private String promptMessage ;
    
    public MainMenuView(){
        
        this.promptMessage = "\nPlese select a menu option: ";
        
        this.menu = "\nQ - Quit"
                + "\n"
                + "\n----------------------------------"
                + "\n Main Menu                        "
                + "\n ---------------------------------"
                + "\nN - Start new game"
                + "\nE - Continue existing game"
                + "\nS - Save game"
                + "\nH - Help"
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
           case "N": //CReates and starts new game
               this.StartNewGame();
               
           case "E": //retrieves existing game
               this.startExistingGame();
               
           case "H": // HELP MENU
               this.displayHelpMenu();
            
           case "S": //SAVE CURRENT GAME
               this.saveGame();
               break;
              
           default:
               System.out.println("\nInvalid selection *** Try again");
               break;     
       }
       return false;
        }

    private void StartNewGame() {
       GameControl.createNewGame(EscapeFromInsanityIsland.getPlayer());//CREATES NEW GAME
       
       //Displays game menu
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
           }

    private void startExistingGame() {
        System.out.println("*** startExistinGame function called"); 
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called"); 
    }

    private void saveGame() {
        System.out.println("*** saveCurrentGame function called"); 
    }
}
