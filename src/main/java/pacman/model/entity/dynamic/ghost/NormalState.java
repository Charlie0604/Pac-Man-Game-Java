package pacman.model.entity.dynamic.ghost;

import pacman.model.entity.Renderable;
import pacman.model.entity.dynamic.physics.Direction;
import pacman.model.entity.dynamic.physics.Vector2D;
import javafx.scene.image.Image;
import pacman.model.entity.dynamic.physics.KinematicState;
import pacman.model.level.Level;

import java.util.Set;

// Normal State Implementation
class NormalState implements GhostState {
    @Override
    public Direction move(GhostImpl ghost, Set<Direction> possibleDirections) {
        return ghost.selectDirection(possibleDirections);
    }

    @Override
    public void onCollide(Level level, Renderable renderable, GhostImpl ghost) {
        if (level.isPlayer(renderable)) {
            level.handleLoseLife();
        }
    }

    @Override
    public void enterState(GhostImpl ghost) {
        ghost.resetImage('n');
        ghost.setGhostMode(GhostMode.SCATTER);
    }
}
