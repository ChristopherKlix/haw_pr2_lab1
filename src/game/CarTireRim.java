package game;

import java.awt.Color;

/**
 * A class that represents a car tire.
 */
public class CarTireRim {

    public void drawAt(int x, int y) {

        final int shade = 60;
        Color darkGray = new Color(shade, shade, shade);

        Drawing.getPen().setColor(darkGray);

        final int tireSize = 60;
        final int size = 40;
        final int offset = (tireSize - size) / 2;

        Drawing.getPen().fillOval(x + offset, y + offset, size, size);

    }

}
