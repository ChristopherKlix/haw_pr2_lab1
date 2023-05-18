package lab1;

import java.awt.Color;
import java.awt.Polygon;

/**
 * A class that represents the bottom of a car body.
 */
public class CarBodyBottom {
    private CarDoor[] doors;

    public CarBodyBottom() {
        this.doors = new CarDoor[2];
        this.doors[0] = new CarDoor();
        this.doors[1] = new CarDoor();
    }

    public void drawAt(int x, int y) {

        final int frontHeight = 35;
        final int backHeight = frontHeight - 5;

        Polygon frame = new Polygon();
        frame.addPoint(x, y);
        frame.addPoint(x + 120 + 180, y - 10);
        frame.addPoint(x + 120 + 180 - 10, y + backHeight);
        frame.addPoint(x + 3, y + frontHeight);

        final int shade = 180;
        Color darkGray = new Color(shade, shade, shade);

        Drawing.getPen().setColor(darkGray);
        Drawing.getPen().fillPolygon(frame);

        Polygon frontDoorFrame = new Polygon();
        final int frontDoorStart = 80;
        frontDoorFrame.addPoint(x + frontDoorStart, y + frontHeight);
        frontDoorFrame.addPoint(x + frontDoorStart - 1, y + frontHeight - 38);
        frontDoorFrame.addPoint(x + frontDoorStart + 50, y + frontHeight - 40);
        frontDoorFrame.addPoint(x + frontDoorStart + 50, y + frontHeight);

        this.doors[0].drawAt(x, y, frontDoorFrame);

        Polygon backDoorFrame = new Polygon();
        final int backDoorStart = 182;
        backDoorFrame.addPoint(x + backDoorStart - 50, y + backHeight + 3);
        backDoorFrame.addPoint(x + backDoorStart - 50, y + backHeight - 35);
        backDoorFrame.addPoint(x + backDoorStart - 1, y + backHeight - 36);
        backDoorFrame.addPoint(x + backDoorStart, y + backHeight + 4);

        this.doors[1].drawAt(x, y, backDoorFrame);
    }
}
