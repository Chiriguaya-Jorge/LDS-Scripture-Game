/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Karla
 */
public class CharacterControlTest {
    
     public CharacterControlTest() {
     }
    
     public void testCalcCharacterLife(){
        System.out.println("calcCharacterLife");
        //****test case1
        System.out.println("\tTest case 1");
        
        //enter values for test case 1
        
        double numberOfHits = 1.0;
        double characterDamage = 10.0;
        double expResult = 10.0; //expected ouput returned value
        // create instance of shipControl calss
        CharacterControl instance = new CharacterControl();
        
        //call function to run test
        double result = instance.calcCharacterLife(characterDamage, numberOfHits);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0001);
        
        
         System.out.println("calcCharacterLife");
        //****test case1
        System.out.println("\tTest case 2");
        
        //enter values for test case 1
        
        numberOfHits = 0.0;
        characterDamage = 10.0;
        expResult = 0.0; //expected ouput returned value
                      
        //call function to run test
        result = instance.calcCharacterLife(characterDamage, numberOfHits);
        
        // compares expected return value agains actual valie
        assertEquals(expResult, result, 0.0001);
     }
}