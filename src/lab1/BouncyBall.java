package lab1;

import java.awt.*;

public class BouncyBall extends GameObject {

    public BouncyBall() {
        super();
    }

    // Drawable
    @Override
    public void draw() {
        // Draw origin cross
        this.drawOrigin();

        // Draw bounding box
        this.drawBoundingBox();

        // Draw position as string for debugging
        Drawing.getPen().setColor(Color.BLACK);
        Drawing.getPen().drawString(this.position.toString(), this.position.x, this.position.y);

        // Draw the ball
        Drawing.getPen().setColor(Color.BLACK);
        Drawing.getPen().fillOval(this.position.x, this.position.y, this.size.width, this.size.height);
    }

    // Animatable
    @Override
    public void update() {
        System.out.println("deltaT: " + Clock.getDeltaT());
        System.out.println("time: " + Clock.getTimeElapsed() + " | " + Clock.getLastTimeElapsed());

        // Update position
         this.position.x += this.velocity.getVelocityXInPixelsPerMs() * Clock.getDeltaT();
         this.position.y += this.velocity.getVelocityYInPixelsPerMs() * Clock.getDeltaT();

        Dimension windowSize = DrawingTool.getFirstWindowSize();

        final int topLimitX = 0;
        final int bottomLimitX = 0;

        // Check for collision with window bounds
        // and wrap around if necessary
        if (this.position.x < -this.size.width && this.velocity.getVelocityX() > 0) {
            this.position.x = -this.size.width;
        } else if (this.position.x < -this.size.width && this.velocity.getVelocityX() < 0) {
            int velocityX = (int) (Math.random() * -400);
            velocityX = -Constants.MIN_VELOCITY;
            this.setVelocityX(velocityX);
            this.position.x = windowSize.width;
        } else if (this.position.x > windowSize.width && this.velocity.getVelocityX() > 0) {
            this.position.x = -this.size.width;
        } else if (this.position.x > windowSize.width && this.velocity.getVelocityX() < 0) {
            this.position.x = windowSize.width;
        }

        if (this.position.y < 0) {
            this.position.y = windowSize.height;
        } else if (this.position.y > windowSize.height) {
            this.position.y = 0;
        }

        this.draw();
    }
}
