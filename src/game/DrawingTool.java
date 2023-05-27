package game;

import javax.swing.JFrame;
import java.awt.*;
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
    @SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal"})
    private DrawingArea drawingArea;

    // Window configuration fields
    @SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal"})
    private boolean isResizable;
    private Dimension windowSize;

    private int fps;

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

        this.fps = 60;

        // Initialize the drawing area
        this.drawingArea = new DrawingArea();

        // Add the drawing area to the window
        this.add(drawingArea);

        // Show the window
        this.setVisible(false);
    }

    public void start() {
        this.setVisible(true);

        KeyboardHandler keyboard = KeyboardHandler.getInstance();
        this.addKeyListener(keyboard);


        // Start the clock
        System.out.println("Getting clock instance");
        Clock.setFps(this.fps);
        Clock clock = Clock.getInstance();

        // Register a frame listener
        System.out.println("Registering frame listener");
        Clock.FrameListener frameListener = new Clock.FrameListener() {
            @Override
            public void onFrameUpdated(int currentFrame) {
                // Perform your logic here based on the current frame update
                redraw();
            }
        };

        Clock.registerFrameListener(frameListener);

        // Start the clock
        System.out.println("Starting clock");
        Clock.start();
    }

    private void redraw() {
        // Get current frame
        int currentFrame = Clock.getCurrentFrame();
        // System.out.println("DrawingTool.redraw at frame " + currentFrame);

        this.drawingArea.revalidate();
        this.drawingArea.repaint();
    }

    private void setWindowSizeToScreenSize() {
        // Get the screen size
        Dimension screenSize = this.getToolkit().getScreenSize();

        // Set the window size to 2/3 of the screen size
        int width = (int) (screenSize.width * 2./3.);
        int height = (int) (screenSize.height * 2./3.);
        Dimension windowSize = new Dimension(width, height);

        // Set the window origin to the center of the screen
        Point origin = new Point((screenSize.width - width) / 2, (screenSize.height - height) / 2);

        // Set the window size to the screen size
        this.setBounds(origin.x, origin.y, windowSize.width, windowSize.height);

        // Set the window size field
        this.windowSize = screenSize;
    }

    public Dimension getWindowSize() {
        return this.windowSize;
    }

    public Dimension getWindowSize(Dimension windowSize) {
        return this.windowSize;
    }

    public void setWindowSize(Dimension windowSize) {
        this.windowSize = windowSize;
        this.setBounds(0, 0, this.windowSize.width, this.windowSize.height);
    }

    public static Dimension getFirstWindowSize() {
        // Get all windows
        Window[] windows = JFrame.getWindows();

        return windows[0].getSize();
    }
}
