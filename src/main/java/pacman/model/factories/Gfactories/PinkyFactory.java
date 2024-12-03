package pacman.model.factories.Gfactories;

import pacman.model.entity.Renderable;
import pacman.model.entity.dynamic.ghost.Ghost;
import pacman.model.entity.dynamic.ghost.newGhost.*;
import pacman.model.entity.dynamic.physics.Vector2D;
import pacman.model.factories.RenderableType;

// PinkyFactory - Concrete factory for creating Pinky ghosts
public class PinkyFactory extends GhostFactory {
    @Override
    public Renderable createRenderable(Vector2D position) {
        super.setGhostImage(RenderableType.PINKY_GHOST);
        Ghost baseGhost = (Ghost) super.createRenderable(position);
        baseGhost.setTargetCorner(targetCorners.get(0)); // Top-left corner
        return new Pinky(baseGhost);
    }
}