/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;
import byui.cit260.ldsScriptureGame.control.InventoryControl;
import java.util.Scanner;
/**
 *
 * @author Reinaldo
 */
public class ItemBagCreationView extends View{
  
  private String height;
  private String width;
  private String depth; 
    
    
    public ItemBagCreationView() {
             super("\n"
                  + "\n------------------------------------------" 
                  + "\n| Item Bag Creation                      |" 
                  + "\n------------------------------------------" 
                  + "\n The largest bag that can be created has  " 
                  + "\n a volume of 40. Anything larger would    " 
                  + "\n be too big for a person to carry long    " 
                  + "\n distances.In addition, the value of each "
                  + "\n parameter should not be greater than 5   "
                  + "\n------------------------------------------" 
                  + "\nQ - Quit                                  " 
                  + "\n------------------------------------------");
             
             this.height="\nPlease enter height of bag:";
             this.width="\nPlease enter width of bag:";
             this.depth="\nPlease enter depth of bag:";
             
    }

       
    @Override
    public boolean doAction(String choice) {
        
         calcItemBagVolume itBag = new calcItemBagVolume(double height, double width, double depth); 
    }

}
