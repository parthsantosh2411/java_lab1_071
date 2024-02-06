import java.io.IOException;

public class InputDemoMain {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            // Command line arguments input
            try {
                int number = Integer.parseInt(args[0]);
                System.out.println("Factorial of " + number + " (via Command Line): " + InputProcessor.factorial(number));
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer as a command line argument.");
            }
            return; // Exit after processing command line input
        }

        System.out.println("Select input method:");
        System.out.println("1. Scanner");
        System.out.println("2. BufferedReader");
        System.out.println("3. DataInputStream");
        System.out.println("4. Console");
        System.out.print("Your choice: ");

        int choice = InputProcessor.inputWithScanner(); // Using Scanner for menu selection
        int number = 0;

        switch (choice) {
            case 1:
                number = InputProcessor.inputWithScanner();
                break;
            case 2:
                number = InputProcessor.inputWithBufferedReader();
                break;
            case 3:
                number = InputProcessor.inputWithDataInputStream();
                break;
            case 4:
                number = InputProcessor.inputWithConsole();
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        System.out.println("Factorial of " + number + ": " + InputProcessor.factorial(number));
    }
}