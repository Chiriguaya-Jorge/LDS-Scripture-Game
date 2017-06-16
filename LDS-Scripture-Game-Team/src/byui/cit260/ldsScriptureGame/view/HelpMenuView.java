/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;
import byui.cit260.ldsScriptureGame.control.GameControl;
import byui.cit260.ldsScriptureGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author dnp
 */
public class HelpMenuView {
  private final String menu;
     private final String promptMessage;
     private static final String MENU = "\n"
                + "\n----------------------------------"
                + "\n Help Menu                        "
                + "\n ---------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nT - Tools available to construct a Mean To Travel"
                + "\nC - Construct tools"
                + "\nV - View map"
                + "\nA - Avoid Obstacles"
                + "\nQ - Quit game"
                + "\n----------------------------------";
     
    public HelpMenuView(){
        System.out.println(MENU);
        
        this.promptMessage = "\n Help Menu: Please select an option: ";
        
        this.menu = "\nQ - Quit"
                + "\n"
                + "\n----------------------------------"
                + "\n Help Menu                        "
                + "\n ---------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nT - Tools available to construct a Mean To Travel"
                + "\nC - Construct tools"
                + "\nV - View map"
                + "\nA - Avoid Obstacles"
                + "\nQ - Quit game"
                + "\n----------------------------------";
                }
    
    
   public void displayHelpMenuView() {
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
                System.out.println("\nInvalid value: value cannot be blank");
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
               
           case "T": // tools available to construct Mean to travel
               this.toolsAvailable();
            
           case "C": //construction tools
               this.constructTools();
               
           case "V": //View map
               this.viewMap();
               
           case "A": //avoid Obstacles during the travel
               this.avoidObstacles();
               break;
              
           default:
               System.out.println("\nInvalid selection *** Try again");
               break;     
       }
       return false;
        }

    private void goalOfGame() {
       System.out.println(
        "\n************************************************"
              + "\n*                                              *"
              + "\n* This is the LDS Scripture Game               *"
              + "\n* In this game you will be placed in the shoes *"
              + "\n* of Nephi and his brothers as they go on a    *"
              + "\n* journey to retrive the Brass Plates as their *"
              + "\n* father, Lehi, instructed them to do because  *"
              + "\n* of the vision he recived from Heavenly       *"
              + "\n* Father                                       *"
              + "\n*                                              *"
              + "\n* You will need to leave Lehi's tent in the    *"
              + "\n* wilderness and travel back to the land of    *"
              + "\n* Jerusalem where you and your family were     *"
              + "\n* driven out from to obtain the record of your *"
              + "\n* ancestors. After doing so, you will need to  *"
              + "\n* bring those records, which are the Brass     *"
              + "\n* Plates, back to your father's tent in the    *"
              + "\n* wilderness.                                  *"
              + "\n*                                              *"
              + "\n* Good luck and may your journy be a success.  *"
              + "\n*                                              *"
              + "\n************************************************"  
       );
    }

    private void move() {
        System.out.println("*** how to move?"); 
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

    private void avoidObstacles() {//
        System.out.println("*** avoidObstacles function called"); 
    }

    void displayMenu() {
        System.out.println("*** DisplayMenu function called"); 
    }

    
    
}
