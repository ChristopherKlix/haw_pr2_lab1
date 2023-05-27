package lab1;

import java.awt.*;

public class Road extends GameObject {

    public Road() {
        super();
    }

    public void setLength(int length) {
        this.size.width = length;
    }

    public int getLength() {
        return this.size.width;
    }

    public void setWidth(int width) {
        this.size.height = width;
    }

    public int getWidth() {
        return this.size.height;
    }

    public void draw() {
        this.update();
    }

    public void update() {
        Drawing.getPen().setColor(Color.GRAY);
        Drawing.getPen().fillRect(0, this.position.y, this.getLength(), this.getWidth());

        Drawing.getPen().setColor(Color.DARK_GRAY);
        Drawing.getPen().fillRect(0, this.position.y, this.getLength(), this.getWidth() / 10);

        // Update position
        this.position.x += this.velocity.getVelocityXInPixelsPerMs() * Clock.getDeltaT();
        this.position.y += this.velocity.getVelocityYInPixelsPerMs() * Clock.getDeltaT();

        // Draw the lines
        Drawing.getPen().setColor(Color.WHITE);
        for (int i = this.position.x; i < this.getLength(); i += 100) {
            // Draw lines with polygon for slight slant
            int[] xPoints = {i + 5, i + 45, i + 50, i};
            int[] yPoints = {295, 295, 305, 305};
            Drawing.getPen().fillPolygon(xPoints, yPoints, 4);
            // Drawing.getPen().fillRect(i, 295, 50, 10);
        }
    }

    Velocity velocity = new Velocity(0, 0);

    Timestamp millisecondsElapsed = new Timestamp(0);

    public void setLastTimestampInMs(int millisecondsElapsed) {
        this.millisecondsElapsed.setLastTimestampInMs(millisecondsElapsed);
    }

    public int getLastTimestampInMs() {
        return this.millisecondsElapsed.getLastTimestampInMs();
    }

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
