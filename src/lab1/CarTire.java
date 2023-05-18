package lab1;

import java.awt.Color;

/**
 * A class that represents a car tire.
 */
public class CarTire {
    private CarTireRim rim;
    private int size;

    public CarTire() {
        this.rim = new CarTireRim();
        this.size = 60;
    }

    public void drawAt(int x, int y) {
        Drawing.getPen().setColor(Color.BLACK);

        Drawing.getPen().fillOval(x, y, this.size, this.size);

        this.rim.drawAt(x, y);
    }
}
