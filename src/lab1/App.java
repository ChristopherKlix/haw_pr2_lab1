package lab1;

/**
 * App entry point
 */
public class App {
    public static void main(String[] args) {
        System.out.println( "App started!" );

//        New Branch changes
        DrawingTool app = new DrawingTool("Drawing Tool");
        app.start();
    }
}
