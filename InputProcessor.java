import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.Console;

public class InputProcessor {

    // Method to calculate factorial
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Input using Scanner
    public static int inputWithScanner() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number (Scanner): ");
        return scanner.nextInt();
    }

    // Input using BufferedReader
    public static int inputWithBufferedReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number (BufferedReader): ");
        return Integer.parseInt(reader.readLine());
    }

    // Input using DataInputStream
    public static int inputWithDataInputStream() throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter a number (DataInputStream): ");
        return Integer.parseInt(dis.readLine());
    }

    // Input using Console
    public static int inputWithConsole() {
        Console console = System.console();
        if (console == null) {
            System.out.println("Console not available, using Scanner instead.");
            return inputWithScanner();
        }
        return Integer.parseInt(console.readLine("Enter a number (Console): "));
    }
}


