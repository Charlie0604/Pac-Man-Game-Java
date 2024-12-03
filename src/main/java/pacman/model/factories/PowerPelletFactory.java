package pacman.model.factories;

import javafx.scene.image.Image;
import pacman.ConfigurationParseException;
import pacman.model.entity.Renderable;
import pacman.model.entity.dynamic.physics.BoundingBox;
import pacman.model.entity.dynamic.physics.BoundingBoxImpl;
import pacman.model.entity.dynamic.physics.Vector2D;
import pacman.model.entity.staticentity.collectable.Pellet;

public class PowerPelletFactory implements RenderableFactory {
    private static final Image PELLET_IMAGE = new Image("maze/pellet.png", 32, 32, false, false);
    private static final int NUM_POINTS = 50;
    private final Renderable.Layer layer = Renderable.Layer.BACKGROUND;

    @Override
    public Renderable createRenderable(
            Vector2D position
    ) {
        try {

            BoundingBox boundingBox = new BoundingBoxImpl(
                    position.add(new Vector2D(-8, -8)),
                    PELLET_IMAGE.getHeight(),
                    PELLET_IMAGE.getWidth()
            );

            return new Pellet(
                    boundingBox,
                    layer,
                    PELLET_IMAGE,
                    NUM_POINTS
            );

        } catch (Exception e) {
            throw new ConfigurationParseException(
                    String.format("Invalid pellet configuration | %s", e));
        }
    }
}