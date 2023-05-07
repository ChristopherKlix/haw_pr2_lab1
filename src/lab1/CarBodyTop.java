package lab1;

import java.awt.Color;
import java.awt.Polygon;

public class CarBodyTop {

    private CarWindow window;

    public CarBodyTop() {
        this.window = new CarWindow();
    }

    public void drawAt(int x, int y) {

        Polygon frame = new Polygon();
        frame.addPoint(x, y);
        frame.addPoint(x + 120, y - 50);
        frame.addPoint(x + 120 + 180, y - 10);

        final int shade = 200;
        Color lightGray = new Color(shade, shade, shade);

        Drawing.getPen().setColor(lightGray);
        Drawing.getPen().fillPolygon(frame);

        this.window.drawAt(x + 30, y - 5);

    }

}