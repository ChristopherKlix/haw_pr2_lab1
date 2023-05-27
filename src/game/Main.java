package game;

/**
 * App entry point
 */
public class Main {
    public static void main(String[] args) {
        System.out.println( "App started!" );

        DrawingTool app = new DrawingTool("Drawing Tool");
        app.start();
    }
}
