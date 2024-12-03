package pacman.model.entity.dynamic.ghost.newGhost;

import pacman.model.entity.dynamic.ghost.Ghost;
import pacman.model.entity.dynamic.physics.*;
import pacman.model.entity.dynamic.physics.Vector2D;


// Clyde (Clyde)
public class Clyde extends GhostDecorator {
    public Clyde(Ghost decoratedGhost) {
        super(decoratedGhost);
    }

    @Override
    public void update(Vector2D playerPosition) {
        double distance = Vector2D.calculateEuclideanDistance(playerPosition, decoratedGhost.getPosition());
        if (distance > 8.0 * 16) { // Converted to grid distance (each grid is 16x16 pixels)
            super.update(playerPosition);
        } else {
            // Hard-coded coordinates for the bottom-left of the game screen (size: 448x576)
            super.update(new Vector2D(0, 576));
        }
    }
}
