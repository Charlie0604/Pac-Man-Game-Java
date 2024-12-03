package pacman.model.entity.dynamic.ghost.newGhost;

import pacman.model.entity.dynamic.ghost.Ghost;
import pacman.model.entity.dynamic.physics.*;

// (Blinky)
public class Blinky extends GhostDecorator {
    public Blinky(Ghost decoratedGhost) {
        super(decoratedGhost);
    }

    @Override
    public void update(Vector2D playerPosition) {
        super.update(playerPosition);
    }
}
