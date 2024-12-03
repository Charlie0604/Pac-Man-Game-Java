package pacman.model.entity.dynamic.ghost;

import pacman.model.entity.Renderable;
import pacman.model.entity.dynamic.physics.Direction;
import pacman.model.level.Level;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

// Frightened State Implementation
class FrightenedState implements GhostState {
    private final Random random = new Random();

    @Override
    public Direction move(GhostImpl ghost, Set<Direction> possibleDirections) {
        return ghost.selectRandomDirection(possibleDirections);
    }

    @Override
    public void onCollide(Level level, Renderable renderable, GhostImpl ghost) {
        if (level.isPlayer(renderable)) {
            level.handleEatGhost();
            ghost.setState('n');
            ghost.respawn();
        }
    }

    @Override
    public void enterState(GhostImpl ghost) {
        ghost.resetImage('f');
        ghost.setGhostMode(GhostMode.FRIGHTENED);
    }
}