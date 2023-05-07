package lab1;

import java.awt.Color;
import java.awt.Polygon;

public class CarWindow {

    public void drawAt(int x, int y) {

        Polygon polygon = new Polygon();

        polygon.addPoint(x, y - 1);
        polygon.addPoint(x + 90, y - 40);
        polygon.addPoint(x + 90 + 100, y - 18);
        polygon.addPoint(x + 90 + 100 + 2, y - 5);

        final int shade = 10;
        Color almostBlack = new Color(shade, shade, shade);
        Drawing.getPen().setColor(almostBlack);
        Drawing.getPen().fillPolygon(polygon);

    }

}