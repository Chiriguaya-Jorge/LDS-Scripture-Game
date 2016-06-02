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
public class CharacterControlTest {
    
    public CharacterControlTest() {
    }

    @Test
    public void testSomeMethod() {
       
        System.out.println("calcCharaterLife");
        //****test case1
        System.out.println("\tTest case 1");
        
        //enter values for test case 1
        double characterDamage = 1.0;
        double numberOfHits = 10.0;
        
        double expResult = 10.0; //expected ouput returned value
        // create instance of shipControl calss
        CharacterControl instance = new CharacterControl();
        
        //call function to run test
        double result = instance.calcCharacterLife(characterDamage, numberOfHits);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
       
    
    
    System.out.println("\tTest case 2");
        
        //enter values for test case 2
        characterDamage = 0.0;
        numberOfHits = 10.0;
        
        expResult = 0.0; //expected ouput returned value
        // create instance of shipControl calss
       
        //call function to run test
        result = instance.calcCharacterLife(characterDamage, numberOfHits);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
         System.out.println("\tTest case 3");
        
        //enter values for test case 2
        characterDamage = 5.0;
        numberOfHits = 0.0;
        
        expResult = 0.0; //expected ouput returned value
        // create instance of shipControl calss
       
        //call function to run test
        result = instance.calcCharacterLife(characterDamage, numberOfHits);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        
         System.out.println("\tTest case 4");
        
        //enter values for test case 2
        characterDamage = 4.0;
        numberOfHits = 11.0;
        
        expResult = 0.0; //expected ouput returned value
        // create instance of shipControl calss
       
        //call function to run test
        result = instance.calcCharacterLife(characterDamage, numberOfHits);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        System.out.println("\tTest case 5");
        
        //enter values for test case 2
        characterDamage = 6.0;
        numberOfHits = 1.0;
        
        expResult = 6.0; //expected ouput returned value
        // create instance of shipControl calss
       
        //call function to run test
        result = instance.calcCharacterLife(characterDamage, numberOfHits);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
