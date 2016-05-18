/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.escapeFromInsanityIsland.model;

import java.io.Serializable;

/**
 *
 * @author Karla
 */
public class Map implements Serializable {
    // class instance viariable
    private boolean rowCount;
    private boolean columnCount;

    public Map() {
    }
    
   
    public boolean isRowCount() {
        return rowCount;
    }

    public void setRowCount(boolean rowCount) {
        this.rowCount = rowCount;
    }

    public boolean isColumnCount() {
        return columnCount;
    }

    public void setColumnCount(boolean columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.rowCount ? 1 : 0);
        hash = 71 * hash + (this.columnCount ? 1 : 0);
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    

