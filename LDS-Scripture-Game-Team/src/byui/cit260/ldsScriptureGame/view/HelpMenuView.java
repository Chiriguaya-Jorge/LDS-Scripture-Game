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
public class HelpMenuView extends View {
  
    public HelpMenuView(){
        super( "\n"
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
                + "\n----------------------------------");
                }

  @Override
    public boolean doAction(String menuOption) {
       menuOption = menuOption.toUpperCase(); //converts to upper case
       
       switch (menuOption){
           case "G": // explains goal of game
               this.goalOfGame();
               break;
           case "M": //how to move
               this.move();
               break;
           case "T": // tools available to construct Mean to travel
               this.toolsAvailable();
               break;
           case "C": //construction tools
               this.constructTools();
               break;
           case "V": //View map
               this.viewMap();
               break;
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
        System.out.println("*** How to move? ***"); 
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
