package pacman.model.entity.dynamic.ghost.newGhost;

import pacman.model.entity.Renderable;
import pacman.model.entity.dynamic.ghost.Ghost;
import pacman.model.entity.dynamic.physics.*;
import pacman.model.entity.dynamic.physics.Vector2D;

// Inky
public class Inky extends GhostDecorator {
    private Renderable shadowGhost;

    public Inky(Ghost decoratedGhost) {
        super(decoratedGhost);
    }

    public void setShadowGhost(Renderable shadowGhost) {
        this.shadowGhost = shadowGhost;
    }

    @Override
    public void update(Vector2D playerPosition) {
        if (shadowGhost == null) {
            super.update(playerPosition);
        }
        else {
            Direction direction = decoratedGhost.getDirection();
            Vector2D offset = switch (direction) {
                case UP -> new Vector2D(0, -2 * 16);
                case DOWN -> new Vector2D(0, 2 * 16);
                case LEFT -> new Vector2D(-2 * 16, 0);
                case RIGHT -> new Vector2D(2 * 16, 0);
            };
            Vector2D pacManDirection = playerPosition.add(offset);
            Vector2D shadowPosition = shadowGhost.getPosition();
            Vector2D vector = new Vector2D((pacManDirection.getX() - shadowPosition.getX()) * 2, (pacManDirection.getY() - shadowPosition.getY()) * 2);
            super.update(shadowPosition.add(vector));
        }
    }
}
