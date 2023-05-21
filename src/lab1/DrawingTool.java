package lab1;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.io.Serial;

/**
 * This class represents a drawing tool.
 * It is a window that contains a drawing area.
 */
public class DrawingTool extends JFrame {
    // This is a serial version UID.
    // It is used to identify the version of a serializable class.
    @Serial
    private static final long serialVersionUID = 1L;

    // The drawing area object
    // This is a reference to an object of class "DrawingArea".
    // It contains the panel on which the drawing is done.
    private DrawingArea drawingArea;

    // Window configuration fields
    private boolean isResizable;
    private Dimension windowSize;

    public DrawingTool(String title) {
        // Call the constructor of the superclass
        super(title);

        // Set the window size to the screen size
        this.setWindowSizeToScreenSize();

        // Close the window when the user clicks the close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configure the window to be resizable
        this.isResizable = true;
        this.setResizable(this.isResizable);

        // Initialize the drawing area
        this.drawingArea = new DrawingArea();

        // Add the drawing area to the window
        this.add(drawingArea);

        // Show the window
        this.setVisible(false);
    }

    public void start() {
        this.setVisible(true);
    }

    private void setWindowSizeToScreenSize() {
        // Get the screen size
        Dimension screenSize = getToolkit().getScreenSize();

        // Set the window size to the screen size
        this.setBounds(0, 0, screenSize.width, screenSize.height);

        // Set the window size field
        this.windowSize = screenSize;
    }

    public Dimension getWindowSize() {
        return this.windowSize;
    }

    public void setWindowSize(Dimension windowSize) {
        this.windowSize = windowSize;
        this.setBounds(0, 0, this.windowSize.width, this.windowSize.height);
    }
}
