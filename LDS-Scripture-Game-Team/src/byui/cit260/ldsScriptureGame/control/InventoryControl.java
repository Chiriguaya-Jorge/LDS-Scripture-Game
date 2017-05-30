/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.control;

/**
 *
 * @author Reinaldo
 */
public class InventoryControl {
    
    public double calcItemBagVolume(double height, double width, double depth){
    
        if (height < 0 || height > 5) {
            return -1;
        }
        if (width < 0 || width > 5){
            return -1;
        }
        if (depth < 0 || depth > 5){
            return -1;
        }
		
	double volume = height * width * depth;
	
        if (volume > 40) {
            return -1;
        }
        else {
            return volume;
        }
    }
    
}
