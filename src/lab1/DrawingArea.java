package lab1;

import javax.swing.JPanel;
import java.awt.*;
import java.io.Serial;
import java.util.ArrayList;

/**
 * A class that provides a static reference to the pen used for drawing.
 */
public class DrawingArea extends JPanel {
    @Serial
    private static final long serialVersionUID = 1L;

    private final ArrayList<BouncyBall> balls;
    private final Road road;
    private final Actor actor;

    private int score;

    public DrawingArea() {
        super();

        // Create 10 balls on after another in y direction
        this.balls = new ArrayList<>();

        this.road = new Road();
        this.road.setLength(this.getToolkit().getScreenSize().width);
        this.road.setWidth(200);
        this.road.setPosition(new Point(0, 200));
        this.road.setVelocityX(-Constants.MIN_VELOCITY);
        this.actor = new Actor();
        this.actor.setSize(new Dimension(60, 60));
        this.actor.setPosition(new Point(400, 200));

        for (int i = 0; i < 2; i++) {
            BouncyBall ball = new BouncyBall();
            int x = (int) (Math.random() * 1000);
            int velocityX = (int) (-Constants.MIN_VELOCITY + Math.random() * -400);
            velocityX = -Constants.MIN_VELOCITY;
            ball.setPosition(new Point(x, 200 + i * 100));
            ball.setVelocityX(velocityX);
            ball.setSize(new Dimension(60, 60));
            this.balls.add(ball);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        // System.out.println("DrawingArea.paintComponent");
        super.paintComponent(g);
        Drawing.setPen(g);

        Drawing.getPen().drawString("Cybertruck", 100, 100);

        // Draw the grass
        Drawing.getPen().setColor(new Color(124, 252, 0));
        Drawing.getPen().fillRect(0, 0, this.getWidth(), this.getHeight());

        // Draw road
        this.road.draw();

        // Draw balls
        for (BouncyBall ball : this.balls) {
            ball.update();
        }

        // Listen for arrow up and down keys
        // and set velocity of actor accordingly
        if (KeyboardHandler.isKeyUpPressed()) {
            this.actor.setVelocityY(-400);
        } else if (KeyboardHandler.isKeyDownPressed()) {
            this.actor.setVelocityY(400);
        } else {
            this.actor.setVelocityY(0);
        }

        this.actor.update();

        // Get x position of every ball and compare to actor x position
        // If ball x is left to actor x, increment score and wait until ball is right of actor again
        for (BouncyBall ball : this.balls) {
            if (ball.getPosition().x < this.actor.getPosition().x) {
                this.score++;
            }
        }

        int scoreX = DrawingTool.getFirstWindowSize().width - 100;
        int scoreY = DrawingTool.getFirstWindowSize().height - 60;

        Drawing.getPen().drawString("Score: " + this.score, scoreX, scoreY);
    }
}
