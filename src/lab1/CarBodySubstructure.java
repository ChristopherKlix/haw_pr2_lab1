package lab1;

import java.awt.Color;
import java.awt.Polygon;

public class CarBodySubstructure {

    public void drawAt(int x, int y) {

        final int frontHeight = 35;
        final int backHeight = frontHeight - 5;

        Polygon frame = new Polygon();
        frame.addPoint(x + 3, y + frontHeight);
        frame.addPoint(x + 120 + 180 - 10, y + backHeight);
        frame.addPoint(x + 120 + 180 - 10, y + backHeight + 7);
        frame.addPoint(x + 120 + 180 - 10 - 30, y + backHeight + 7 + 5);
        frame.addPoint(x + 5 + 45, y + frontHeight + 7 + 5);
        frame.addPoint(x + 5, y + frontHeight + 7);

        final int shade = 140;
        Color darkGray = new Color(shade, shade, shade);

        Drawing.getPen().setColor(darkGray);
        Drawing.getPen().fillPolygon(frame);

    }

}
