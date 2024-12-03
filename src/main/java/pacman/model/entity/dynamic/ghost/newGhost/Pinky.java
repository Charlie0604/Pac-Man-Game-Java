package pacman.model.entity.dynamic.ghost.newGhost;

import pacman.model.entity.dynamic.ghost.Ghost;
import pacman.model.entity.dynamic.physics.*;

// Speedy (Pinky)
public class Pinky extends GhostDecorator {
    public Pinky(Ghost decoratedGhost) {
        super(decoratedGhost);
    }

    @Override
    public void update(Vector2D playerPosition) {
        Direction direction = decoratedGhost.getDirection();
        Vector2D offset = switch (direction) {
            case UP -> new Vector2D(0, -4 * 16);
            case DOWN -> new Vector2D(0, 4 * 16);
            case LEFT -> new Vector2D(-4 * 16, 0);
            case RIGHT -> new Vector2D(4 * 16, 0);
        };
        Vector2D targetPosition = playerPosition.add(offset);
        //decoratedGhost.setPlayerPosition(targetPosition);
        super.update(targetPosition);
    }
}

