package game;

import java.awt.Color;
import java.awt.Polygon;

public class CarDoor {

    public void drawAt(int x, int y, Polygon p) {

        final int shade = 100;
        Color lightGray = new Color(shade, shade, shade);

        Drawing.getPen().setColor(lightGray);
        Drawing.getPen().drawPolygon(p);

    }

}
