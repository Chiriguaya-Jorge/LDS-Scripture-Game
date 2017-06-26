/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.model;

import java.io.Serializable;

/**
 *
 * @author Team Work
 */
public class Game implements Serializable {
    
    private double totalTime;
   
    private Player player;
    private InventoryItem[] inventory; 
    private Map map;
   
    

    public Game() {
        this.totalTime = 0;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", player=" + player.toString() + '}';
    }
   
    
}