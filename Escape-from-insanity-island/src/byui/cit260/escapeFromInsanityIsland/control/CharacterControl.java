/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

/**
 *
 * @author Karla
 */
public class CharacterControl {
    public double caclCharacterLife (double characterDamage, double numberOfHits){ 
     if (numberOfHits < 1) {
         return 0;
     }        

     if (characterDamage < 1 || characterDamage> 11) {
         return 0;				
     }
				
  double totalDamage= characterDamage * numberOfHits;			
				
   return totalDamage;}
    
}
