package pacman.model.factories.Gfactories;

import pacman.model.entity.Renderable;
import pacman.model.entity.dynamic.ghost.Ghost;
import pacman.model.entity.dynamic.ghost.newGhost.*;
import pacman.model.entity.dynamic.physics.Vector2D;
import pacman.model.factories.RenderableType;

// ClydeFactory - Concrete factory for creating Clyde ghosts
public class ClydeFactory extends GhostFactory {
    @Override
    public Renderable createRenderable(Vector2D position) {
        super.setGhostImage(RenderableType.CLYDE_GHOST);
        Ghost baseGhost = (Ghost) super.createRenderable(position);
        baseGhost.setTargetCorner(targetCorners.get(2)); // Bottom-left corner
        return new Clyde(baseGhost);
    }
}
