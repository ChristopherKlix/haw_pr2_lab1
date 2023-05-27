package lab1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    //private DrawingArea drawingArea;

    /**
     * Singleton instance
     */

    private static MainWindow instance = null;

    private MainWindow() {
        // This is a singleton class.

        super("Window");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Singleton accessor
     */

    public static MainWindow getInstance() {
        if (instance == null) {
            instance = new MainWindow();
        }
        return instance;
    }

    /**
     * Starts the window.
     */

    public void start() {
        System.out.println("MainWindow.start");

        this.setVisible(true);
    }



    /**
     * Sets the window size to the screen size.
     */

    public Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }

    /**
     * utility methods related to the Window.
     */

    public Dimension getWindowSize() {
        return this.getSize();
    }

    public void setWindowSize(Dimension size) {
        this.setSize(size);
    }

    public void setWindowSize(int width, int height) {
        this.setSize(width, height);
    }

    public void setWindowSizeToScreenSize() {
        this.setSize(this.getScreenSize());
    }

    public void resizeToFullscreen() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public boolean isFullscreen() {
        return this.getExtendedState() == JFrame.MAXIMIZED_BOTH;
    }

    public void setPosition(Point position) {
        this.setLocation(position);
    }

    public void setPosition(int x, int y) {
        this.setLocation(x, y);
    }

    public Point getPosition() {
        return this.getLocation();
    }
}
