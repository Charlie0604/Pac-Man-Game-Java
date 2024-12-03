package pacman.model.factories.Gfactories;

import pacman.model.entity.Renderable;
import pacman.model.entity.dynamic.ghost.Ghost;
import pacman.model.entity.dynamic.ghost.newGhost.*;
import pacman.model.entity.dynamic.physics.Vector2D;
import pacman.model.factories.RenderableType;
import pacman.model.maze.Maze;

// InkyFactory - Concrete factory for creating Inky ghosts
public class InkyFactory extends GhostFactory {

    @Override
    public Renderable createRenderable(Vector2D position) {
        super.setGhostImage(RenderableType.INKY_GHOST);
        Ghost baseGhost = (Ghost) super.createRenderable(position);
        baseGhost.setTargetCorner(targetCorners.get(3)); // Bottom-right corner
        return new Inky(baseGhost);
    }
}

