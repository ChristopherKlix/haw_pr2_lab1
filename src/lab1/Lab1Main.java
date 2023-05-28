package lab1;

import DrawingTool.DrawingTool;

/**
 * <h1>Lab 1</h1>
 * Main class for Lab 1.
 * This class is a singleton.
 *
 * <p>
 * This class does instantiate the MainWindow object.
 * I contains the entire application and controls lifecycle.
 * </p>
 *
 * <pre>
 * mainWindow.start();
 * </pre>
 *
 * <p>
 * The application is started by calling the start() method.
 * <pre>
 * Lab1Main.start();
 * </pre>
 * </p>
 *
 * @version 0.1.0
 * @see MainWindow
 * @author Christopher Klix
 */
public class Lab1Main {

    private static Lab1Main instance = null;

    /**
     * <h2>Private constructor</h2>
     *
     * <p>
     *     This is a private constructor.
     *     It is only called once by the {@link #getInstance()} method.
     * </p>
     *
     * @see #getInstance()
     */
    private Lab1Main() {
        // This is a singleton class.
    }

    /**
     * <h2>Singleton accessor</h2>
     *
     * <p>
     *     This method returns the singleton instance of this class.
     *     If the instance does not exist, it will be created.
     * </p>
     *
     * @return The singleton instance of this class.
     *
     * @see #instance
     */
    public static Lab1Main getInstance() {
        if (Lab1Main.instance == null) {
            Lab1Main.instance = new Lab1Main();
        }
        return Lab1Main.instance;
    }

    /**
     * <h2>Starts the application.</h2>
     *
     * <p>
     *     This method starts the application.
     *     It creates a new {@link MainWindow} object and calls its {@link MainWindow#start()} method.
     *     The {@link MainWindow} object is a singleton.
     * </p>
     *
     * @see MainWindow
     * @see MainWindow#start()
     */
    public void start() {
        System.out.println("Lab1Main.start");

        // ------------------------------------------------------------
        // Create a new MainWindow
        // ------------------------------------------------------------
        MainWindow mainWindow = MainWindow.getInstance();
        mainWindow.setWindowSize(800, 600);
        mainWindow.setPosition(100, 100);
        mainWindow.setTitle("Lab 1");
        mainWindow.start();
    }

}
