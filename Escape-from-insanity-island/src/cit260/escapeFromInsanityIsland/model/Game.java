/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.escapeFromInsanityIsland.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Karla
 */
public class Game implements Serializable{
   //class instance variables
    private String noPeople;
    private double record;

    public Game() {
    }
    
    public String getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(String noPeople) {
        this.noPeople = noPeople;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.noPeople);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.record) ^ (Double.doubleToLongBits(this.record) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.record) != Double.doubleToLongBits(other.record)) {
            return false;
        }
        if (!Objects.equals(this.noPeople, other.noPeople)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + ", record=" + record + '}';
    }
    
    
    
    
    
    
            
}
