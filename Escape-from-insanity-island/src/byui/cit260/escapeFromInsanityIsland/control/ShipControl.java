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
public class ShipControl {
    public double calcAxeTime (double axeTime, double timesUsed){ 
     if (axeTime < 1 || axeTime >2) {
         return 0;
     }        

     if (timesUsed < 1 || timesUsed > 16) {
         return 0;				
     }
				
  double calcPartialTime = axeTime * timesUsed;			
				
   return calcPartialTime;
}
    
    public double calcSawTime (double sawTime, double timesUsed){ 
     if (sawTime < 1 || sawTime >3) {
         return 0;
     }        

     if (timesUsed < 1 || timesUsed > 16) {
         return 0;				
     }
				
  double calcPartialSawTime = sawTime * timesUsed;			
				
   return calcPartialSawTime;
    }
   
    public double calcHammerTime (double hammerTime, double timesUsed){ 
     if (hammerTime < 1 || hammerTime >2) {
         return 0;
     }        

     if (timesUsed < 1 || timesUsed > 21) {
         return 0;				
     }
				
  double calcPartialHammerTime = hammerTime * timesUsed;			
				
   return calcPartialHammerTime;}
}
