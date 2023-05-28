import lab1.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("App started!");

        // Check if args[0] is a valid lab number
        if (args.length == 0) {
            // Throw an exception
            throw new Exception("No lab number specified.");
        }

        // Switch on args[0]
        final int labNumber = Integer.parseInt(args[0]);

        switch (labNumber) {
            case 1:
                Lab1Main lab1 = Lab1Main.getInstance();
                lab1.start();
                break;
            case 2:
                throw new Exception("Lab 2 not implemented.");
            case 3:
                throw new Exception("Lab 3 not implemented.");
            default:
                // Throw an exception
                throw new Exception("Invalid lab number.");
        }
    }
}
