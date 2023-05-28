package lab1;

import DrawingTool.DrawingTool;

public class Lab1Main {

    private static Lab1Main instance = null;

    private Lab1Main() {
        // This is a singleton class.
    }

    public static Lab1Main getInstance() {
        if (instance == null) {
            instance = new Lab1Main();
        }
        return instance;
    }

    public static void start() {
        System.out.println("Lab1Main.start");

        // Create a new MainWindow
        MainWindow mainWindow = MainWindow.getInstance();
        mainWindow.setWindowSize(800, 600);
        mainWindow.setPosition(100, 100);
        mainWindow.setTitle("Lab 1");
        mainWindow.start();
    }

}
