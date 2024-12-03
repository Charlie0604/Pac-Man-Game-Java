package pacman.model.entity.dynamic.ghost.newGhost;

import javafx.scene.image.Image;
import pacman.model.entity.Renderable;
import pacman.model.entity.dynamic.ghost.Ghost;
import pacman.model.entity.dynamic.ghost.GhostMode;
import pacman.model.entity.dynamic.physics.*;
import pacman.model.level.Level;

import java.util.*;

// Abstract class for Ghosts, serving as the base for all types
public abstract class GhostDecorator implements Ghost {
    protected Ghost decoratedGhost;

    public GhostDecorator(Ghost decoratedGhost) {
        this.decoratedGhost = decoratedGhost;
    }

    @Override
    public void setSpeeds(Map<GhostMode, Double> speeds) {
        decoratedGhost.setSpeeds(speeds);
    }

    @Override
    public void setGhostMode(GhostMode ghostMode) {
        decoratedGhost.setGhostMode(ghostMode);
    }

    @Override
    public void update(Vector2D position) {
        decoratedGhost.update(position);
    }

    @Override
    public void update() {
        decoratedGhost.update();
    }

    @Override
    public Image getImage() {
        return decoratedGhost.getImage();
    }

    @Override
    public double getWidth() {
        return decoratedGhost.getWidth();
    }

    @Override
    public double getHeight() {
        return decoratedGhost.getHeight();
    }

    @Override
    public Vector2D getPosition() {
        return decoratedGhost.getPosition();
    }

    @Override
    public Layer getLayer() {
        return decoratedGhost.getLayer();
    }

    @Override
    public BoundingBox getBoundingBox() {
        return decoratedGhost.getBoundingBox();
    }

    @Override
    public void reset() {
        decoratedGhost.reset();
    }

    @Override
    public Vector2D getPositionBeforeLastUpdate() {
        return decoratedGhost.getPositionBeforeLastUpdate();
    }

    @Override
    public void setPosition(Vector2D position) {
        decoratedGhost.setPosition(position);
    }

    @Override
    public boolean collidesWith(Renderable renderable) {
        return decoratedGhost.collidesWith(renderable);
    }

    @Override
    public void collideWith(Level level, Renderable renderable) {
        decoratedGhost.collideWith(level, renderable);
    }

    @Override
    public void setPossibleDirections(Set<Direction> possibleDirections) {
        decoratedGhost.setPossibleDirections(possibleDirections);
    }

    @Override
    public Direction getDirection() {
        return decoratedGhost.getDirection();
    }

    @Override
    public Vector2D getCenter() {
        return decoratedGhost.getCenter();
    }

    @Override
    public void setPlayerPosition(Vector2D playerPosition){
        decoratedGhost.setPlayerPosition(playerPosition);
    }

    @Override
    public void setTargetCorner(Vector2D targetCorner){
        decoratedGhost.setTargetCorner(targetCorner);
    }

    @Override
    public void setState(char flage){
        decoratedGhost.setState(flage);
    }

    @Override
    public boolean isFrightenedState(){
        return decoratedGhost.isFrightenedState();
    }
}