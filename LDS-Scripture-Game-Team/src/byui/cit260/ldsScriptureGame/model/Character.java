/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.model;

import java.awt.Point;
import java.io.Serializable;
import javax.swing.ImageIcon;
import byui.cit260.ldsScriptureGame.model.Location;

/**
 *
 * @author Team Work
 */
public enum Character implements Serializable {
    
    Lehi("He is the prophet and leader of the family."),
    Nephi("Faithful son and later the prophet leader of the Nephites."),
    Sam("The youngest boy and faithful brother of Nephi."),
    Laman("The oldest rebellious brother and leader of the Lamanites."),
    Lemuel("The 2nd oldest rebellious brother who went with Laman"),
    Laban("The owner of the brass plates, a wicked man."),
    Zoram("Laban servant that became a faithful follower of Nephi");
    
    private final String description;
    private final Point coordinates;
    
    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    
}
