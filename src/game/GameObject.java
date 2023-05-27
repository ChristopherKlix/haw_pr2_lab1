package game;

import java.awt.*;

public abstract class GameObject implements Drawable, Animatable {
    // Drawable
    protected Point position;
    protected Dimension size;

    // Animatable
    protected Velocity velocity;

    public GameObject() {
        this.position = new Point(0, 0);
        this.size = new Dimension(0, 0);

        this.velocity = new Velocity(0, 0);
    }

    protected void drawOrigin() {
        final int originSize = 4;
        Drawing.getPen().setColor(Color.RED);
        Drawing.getPen().fillRect(this.position.x - originSize / 2, this.position.y - originSize / 2, originSize, originSize);
    }

    protected void drawBoundingBox() {
        Drawing.getPen().setColor(Color.BLUE);
        Drawing.getPen().drawRect(this.position.x, this.position.y, this.size.width, this.size.height);
    }


    // Drawable

    public void setPosition(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return this.position;
    }

    public void setSize(Dimension size) {
        this.size = size;
    }

    public Dimension getSize() {
        return this.size;
    }


    // Animatable

    // Accessor and mutator methods for velocity

    public void setVelocity(Velocity velocity) {
        this.velocity.setVelocityX(velocity.getVelocityX());
        this.velocity.setVelocityY(velocity.getVelocityY());
    }

    public Velocity getVelocity() {
        return this.velocity;
    }

    // Accessors and mutators for velocityX and velocityY

    public void setVelocityX(int velocityX) {
        this.velocity.setVelocityX(velocityX);
    }

    public int getVelocityX() {
        return this.velocity.getVelocityX();
    }

    public void setVelocityY(int velocityY) {
        this.velocity.setVelocityY(velocityY);
    }

    public int getVelocityY() {
        return this.velocity.getVelocityY();
    }
}
