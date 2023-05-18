package lab1;

import java.awt.Graphics;

/**
 * A class that provides a static reference to the pen used for drawing.
 */
public class Drawing {
    private static Graphics pen;

    public static void setPen(Graphics graphics) {
        pen = graphics;
    }

    public static Graphics getPen() {
        if (pen == null) {
            throw new IllegalStateException("Drawing pen has not been set");
        }

        return pen;
    }
}