package game;

import java.awt.Graphics;

/**
 * A class that provides a static reference to the pen used for drawing.
 */
public class Drawing {
    private static Graphics pen;

    private Drawing() {
        // This is a utility class.
        // It should not be instantiated.
    }

    public static void setPen(Graphics graphics) {
        Drawing.pen = graphics;
    }

    public static Graphics getPen() {
        if (Drawing.pen == null) {
            throw new IllegalStateException("Drawing pen has not been set");
        }

        return Drawing.pen;
    }
}