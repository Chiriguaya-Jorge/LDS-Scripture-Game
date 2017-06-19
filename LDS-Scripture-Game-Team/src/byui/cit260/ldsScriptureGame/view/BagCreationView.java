/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import java.util.Scanner;

/**
 *
 * @author Reinaldo
 */
public class BagCreationView extends View {
    
        
        
    
    
    
    public BagCreationView() {
            super ("\n"
                  + "\n--------------------------------" 
                  + "\n| Bag Creation Menu            |" 
                  + "\n--------------------------------" 
                  + "\nI - Item Bag" 
                  + "\nW - Water Bag" 
                  + "\nQ - Quit" 
                  + "\n--------------------------------");
    }

   

    
        @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "I": 
                this.itemBagCreation();
                break;
            case "W":
                this.waterBagCreation();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
        
        return false;
}

    private void itemBagCreation(){
    
       System.out.println("*** ITEM BAGS CREATED ***");
    }
    
    private void waterBagCreation(){
        System.out.println("*** WATER BAG CREATED ***");
    }
    
  
}
