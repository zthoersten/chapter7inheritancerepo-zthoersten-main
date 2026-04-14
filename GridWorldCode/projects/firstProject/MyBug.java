import java.awt.Color;

import info.gridworld.grid.Location;
import info.gridworld.grid.*;
import info.gridworld.actor.*;

public class MyBug extends info.gridworld.actor.Bug {
    public MyBug() {
        setColor(Color.PINK);
    }
    
    public void act() {
        if (canMove()) {
            if (Math.random() < 0.8) {
                move(); // 80%
            } else {
                turn(); // 20%
                setColor(new Color(Math.round(Math.random() * 255), Math.round(Math.random() * 255), Math.round(Math.random() * 255)));
            }
        } else {
            turn();
            setColor(new Color(Math.round(Math.random() * 255), Math.round(Math.random() * 255), Math.round(Math.random() * 255)));
        }
    }
    
    public void move() {
        Grid<info.gridworld.actor.Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }
}