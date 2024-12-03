package pacman.model.entity.dynamic.ghost;

import pacman.model.entity.Renderable;
import pacman.model.entity.dynamic.physics.Direction;
import pacman.model.entity.dynamic.physics.Vector2D;
import javafx.scene.image.Image;
import pacman.model.entity.dynamic.physics.KinematicState;
import pacman.model.level.Level;

import java.util.Set;

// State Interface
public interface GhostState {
    /***
     * select direction for the ghost to move
     * @param ghost Ghost object
     * @param possibleDirections set of direction that ghost can move to
     */
    Direction move(GhostImpl ghost, Set<Direction> possibleDirections);

    /***
     * notify level that a collition with player has happened
     * @param level Level object
     * @param renderable Renderable object check if is player
     * @param ghost Ghost object
     */
    void onCollide(Level level, Renderable renderable, GhostImpl ghost);

    /***
     * change the sprite of the ghost
     * @param ghost Ghost object
     */
    void enterState(GhostImpl ghost);
}
