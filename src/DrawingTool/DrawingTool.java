package DrawingTool;

import java.awt.*;

/**
 * <h1>DrawingTool</h1>
 *
 * <p>
 *     This abstract class does provide a simple
 *     accessor to a "pen" that hides access to
 *     the {@link Graphics} class and methods like:
 *     <pre>
 *         {@link Graphics#setColor(Color)}
 *         {@link Graphics#drawRect(int, int, int, int)}
 *         {@link Graphics#fillOval(int, int, int, int)}
 *     </pre>
 * </p>
 *
 * @see Graphics
 *
 * @version 1.0.0
 * @author christopherklix
 */
public abstract class DrawingTool {
    /**
     * <h2>The Graphics context</h2>
     *
     * <p>
     *     Stores the {@link Graphics} context for
     *     the graphics to be drawn on.
     * </p>
     */
    private static Graphics context = null;

    /**
     * <h2>Getter for the Graphics context</h2>
     *
     * @return The {@link Graphics} context for drawings.
     */
    public static Graphics getPen() {
        return DrawingTool.context;
    }

    /**
     * <h2>Setter for the Graphics context</h2>
     *
     * @param context The graphics context to set.
     */
    public static void setPen(Graphics context) {
        DrawingTool.context = context;
    }
}
