package lab1;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.Serial;

/**
 * A class that provides a static reference to the pen used for drawing.
 */
public class DrawingArea extends JPanel {
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Drawing.setPen(g);

        Tesla cybertruck = new Tesla();
        cybertruck.drawAt(100, 200);

        Tesla model3 = new Tesla();
        model3.drawAt(400, 200);

        Drawing.getPen().drawString("Cybertruck", 100, 100);
    }
}
