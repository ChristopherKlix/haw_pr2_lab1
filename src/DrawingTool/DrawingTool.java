package DrawingTool;

import java.awt.Graphics;

public abstract class DrawingTool {
    private static Graphics pen = null;

    public static Graphics getPen() {
        return DrawingTool.pen;
    }

    public static void setPen(Graphics pen) {
        DrawingTool.pen = pen;
    }
}
