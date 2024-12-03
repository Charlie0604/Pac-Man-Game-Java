package pacman.model.factories.Gfactories;

import pacman.model.entity.Renderable;
import pacman.model.entity.dynamic.ghost.Ghost;
import pacman.model.entity.dynamic.ghost.newGhost.*;
import pacman.model.entity.dynamic.physics.Vector2D;
import pacman.model.factories.RenderableType;

// BlinkyFactory - Concrete factory for creating Blinky ghosts
public class BlinkyFactory extends GhostFactory {
    @Override
    public Renderable createRenderable(Vector2D position) {
        super.setGhostImage(RenderableType.BLINKY_GHOST);
        Ghost baseGhost = (Ghost) super.createRenderable(position);
        baseGhost.setTargetCorner(targetCorners.get(1)); // Top-right corner
        return new Blinky(baseGhost);
    }


}