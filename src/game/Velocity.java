package game;

public class Velocity {
    private int velocityX;
    private int velocityY;

    private int fps;

    public Velocity() {
        this(0, 0, 60);
    }

    public Velocity(int velocityX, int velocityY) {
        this(velocityX, velocityY, 60);
    }

    public Velocity(int velocityX, int velocityY, int fps) {
        this.velocityX = velocityX;
        this.velocityY = velocityY;

        this.fps = fps;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public int getVelocityX() {
        return this.velocityX;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public int getVelocityY() {
        return this.velocityY;
    }

    // Getter for velocityX in pixels per millisecond
    public double getVelocityXInPixelsPerMs() {
        return this.velocityX / 1000.0;
    }

    // Getter for velocityX in pixels per second
    public double getVelocityXInPixelsPerSecond() {
        return this.velocityX;
    }

    // Getter for velocityX in pixels per frame
    public double getVelocityXInPixelsPerFrame() {
        return this.velocityX / (double) this.fps;
    }

    // Getter for velocityY in pixels per millisecond
    public double getVelocityYInPixelsPerMs() {
        return this.velocityY / 1000.0;
    }

    // Getter for velocityY in pixels per second
    public double getVelocityYInPixelsPerSecond() {
        return this.velocityY;
    }

    // Getter for velocityY in pixels per frame
    public double getVelocityYInPixelsPerFrame() {
        return this.velocityY / (double) this.fps;
    }

    // Getter & Setter for fps
    public void setFps(int fps) {
        this.fps = fps;
    }

    public int getFps() {
        return this.fps;
    }
}
