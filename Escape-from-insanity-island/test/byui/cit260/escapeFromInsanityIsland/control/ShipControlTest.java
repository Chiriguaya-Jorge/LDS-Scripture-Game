/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karla
 */
public class ShipControlTest {
    
    public ShipControlTest() {
    }

    /**
     * Test of calcAxeTime method, of class ShipControl.
     */
    @Test
    public void testCalcAxeTime() {
        System.out.println("calcAxeTime");
        //****test case1
        System.out.println("\tTest case 1");
        
        //enter values for test case 1
        double axeTime = 1.0;
        double timesUsed = 3.0;
        
        double expResult = 3.0; //expected ouput returned value
        // create instance of shipControl calss
        ShipControl instance = new ShipControl();
        
        //call function to run test
        double result = instance.calcAxeTime(axeTime, timesUsed);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
        
       
        //****CASE 2****
       // ****
        System.out.println("\tTest case 2");
        
        //enter values for test case 2
        axeTime = 1.0;
        timesUsed = 0.0;
        
        expResult = 0.0; //expected ouput returned value
                  
        //call function to run test
        result = instance.calcAxeTime(axeTime, timesUsed);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0);
        // TODO review the generated/* test code and remove the default call to fail.
       
        
           /******TEST CASE  3***
            * ***
            **********/
            System.out.println("\tTest case 3");
        
        //enter values for test case 2
        axeTime = 0.0;
        timesUsed = 10.0;
        
        expResult = 0.0; //expected ouput returned value
                  
        //call function to run test
        result = instance.calcAxeTime(axeTime, timesUsed);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        /****** TEST CASE 4****
         * 
         */
        
         System.out.println("\tTest case 4");
        
        //enter values for test case 2
        axeTime = 3.0;
        timesUsed = 8.0;
        
        expResult = 0.0; //expected ouput returned value
                  
        //call function to run test
        result = instance.calcAxeTime(axeTime, timesUsed);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
        
        
        /****** TEST CASE 5 ****
         * ***
         */
       System.out.println("\tTest case 5");
        
        //enter values for test case 2
        axeTime = 1.0;
        timesUsed = 15.0;
        
        expResult = 15.0; //expected ouput returned value
                  
        //call function to run test
        result = instance.calcAxeTime(axeTime, timesUsed);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
        
        
        
        /****** TEST CASE 6****
         * 
         */
        System.out.println("\tTest case 6");
        
        //enter values for test case 2
        axeTime = 2.0;
        timesUsed = 1.0;
        
        expResult = 2.0; //expected ouput returned value
                  
        //call function to run test
        result = instance.calcAxeTime(axeTime, timesUsed);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
        
        
        
        /* ******* TEST CASE 7 * **
        **
        */
        System.out.println("\tTest case 7");
        
        //enter values for test case 2
        axeTime = 2.0;
        timesUsed = 15.0;
        
        expResult = 30.0; //expected ouput returned value
                  
        //call function to run test
        result = instance.calcAxeTime(axeTime, timesUsed);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
// *********SAW TIME******
    /**
     * Test of calcSawTime method, of class ShipControl.
     */
    @Test
    public void testCalcSawTime() {
        System.out.println("calcSawTime");
        System.out.println("\tTest case 1");
        
        double sawTime = 2.0;
        double timesUsed = 8.0;
        double expResult = 16.0;
        
        ShipControl instance = new ShipControl();
       
        double result = instance.calcSawTime(sawTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
       
        
         System.out.println("\tTest case 2");
        
        sawTime = 2.0;
        timesUsed = 0.0;
        expResult = 0.0;
                  
       result = instance.calcSawTime(sawTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and
        
        
    System.out.println("\tTest case 3");
        
        sawTime = 0.0;
        timesUsed = 4.0;
        expResult = 0.0;
                  
       result = instance.calcSawTime(sawTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and
        
        
      System.out.println("\tTest case 4");
        
        sawTime = 4.0;
        timesUsed = 6.0;
        expResult = 0.0;
                  
       result = instance.calcSawTime(sawTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and
        
        
      System.out.println("\tTest case 5");
        
        sawTime = 1.0;
        timesUsed = 12.0;
        expResult = 12.0;
                  
       result = instance.calcSawTime(sawTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and
        
        
     System.out.println("\tTest case 6");
        
        sawTime = 1.0;
        timesUsed = 1.0;
        expResult = 1.0;
                  
       result = instance.calcSawTime(sawTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and
        
        
      System.out.println("\tTest case 7");
        
        sawTime = 3.0;
        timesUsed = 15.0;
        expResult = 45.0;
                  
       result = instance.calcSawTime(sawTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and
    }

    
    // ******HAMMER TIME*****
    /**
     * Test of calcHammerTime method, of class ShipControl.
     */
    @Test
    public void testCalcHammerTime() {
        System.out.println("calcHammerTime");
         System.out.println("\tTest case 1");
         
        double hammerTime = 1.0;
        double timesUsed = 13.0;
         double expResult = 13.0;
        ShipControl instance = new ShipControl();
        
        double result = instance.calcHammerTime(hammerTime, timesUsed);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
              
         
      System.out.println("\tTest case 2");
         
        hammerTime = 1.0;
        timesUsed = 0.0;
        expResult = 0.0;
        
        result = instance.calcHammerTime(hammerTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
     
        
      System.out.println("\tTest case 3");
         
        hammerTime = 0.0;
        timesUsed = 6.0;
        expResult = 0.0;
        
        result = instance.calcHammerTime(hammerTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
      
     System.out.println("\tTest case 4");
         
        hammerTime = 2.0;
        timesUsed = 10.0;
        expResult = 0.0;
        
        result = instance.calcHammerTime(hammerTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
        
    System.out.println("\tTest case 5");
         
        hammerTime = 1.0;
        timesUsed = 3.0;
        expResult = 3.0;
        
        result = instance.calcHammerTime(hammerTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
        
        
   System.out.println("\tTest case 6");
         
        hammerTime = 1.0;
        timesUsed = 17.0;
        expResult = 17.0;
        
        result = instance.calcHammerTime(hammerTime, timesUsed);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }
    
       
}
