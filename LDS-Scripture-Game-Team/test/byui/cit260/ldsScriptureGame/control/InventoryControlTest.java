/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reinaldo
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcItemBagVolume method, of class InventoryControl.
     */
    @Test
    public void testCalcItemBagVolume() {
        
        System.out.println("calcItemBagVolume");
        System.out.println("\tTest case #1");
        
        double height = 5.0;
        double width = 2.0;
        double depth = 4.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 40.0;
        double result = instance.calcItemBagVolume(height, width, depth);
        assertEquals(expResult, result, 0.0);
       
 
        System.out.println("\tTest case #2");
        
        height = -3.0;
        width = 4.0;
        depth = 3.0;
        
        expResult = -1.0;
        result = instance.calcItemBagVolume(height, width, depth);
        assertEquals(expResult, result, 0.0);
        
 System.out.println("\tTest case #3");
        
        height = 2.0;
        width = -2.0;
        depth = 3.0;
        
        expResult = -1.0;
        result = instance.calcItemBagVolume(height, width, depth);
        assertEquals(expResult, result, 0.0);
        
     System.out.println("\tTest case #4");
        
        height = 1.0;
        width = 4.0;
        depth = -1.0;
        
        expResult = -1.0;
        result = instance.calcItemBagVolume(height, width, depth);
        assertEquals(expResult, result, 0.0);
        
 System.out.println("\tTest case #5");
        
        height = 6.0;
        width = 1.0;
        depth = 5.0;
        
        expResult = -1.0;
        result = instance.calcItemBagVolume(height, width, depth);
        assertEquals(expResult, result, 0.0);
        
    
 System.out.println("\tTest case #6");
        
        height = 0.0;
        width = 2.0;
        depth = 3.0;
        
        expResult = 0.0;
        result = instance.calcItemBagVolume(height, width, depth);
        assertEquals(expResult, result, 0.0);
        
    
 System.out.println("\tTest case #7");
        
        height = 1.0;
        width = 0.0;
        depth = 4.0;
        
        expResult = 0.0;
        result = instance.calcItemBagVolume(height, width, depth);
        assertEquals(expResult, result, 0.0);
       
System.out.println("\tTest case #8");
        
        height = 2.0;
        width = 5.0;
        depth = 0.0;
        
        expResult = 0.0;
        result = instance.calcItemBagVolume(height, width, depth);
        assertEquals(expResult, result, 0.0);
        
    
 System.out.println("\tTest case #9");
        
        height = 0.1;
        width = 4.9;
        depth = 2.5;
        
        expResult = 1.225;
        result = instance.calcItemBagVolume(height, width, depth);
        assertEquals(expResult, result, 0.0);
        }
    
}