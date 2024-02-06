import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 9) {
                System.out.println("Exiting calculator.");
                break;
            }

            try {
                processCalculatorOperations(choice, calculator, scanner);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }

    public static void processCalculatorOperations(int choice, Calculator calculator, Scanner scanner) {
        double a, b;
        switch (choice) {
            case 1: // Add
                System.out.print("Enter two numbers: ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println("Result: " + calculator.add(a, b));
                break;
            case 2: // Subtract
                System.out.print("Enter two numbers: ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println("Result: " + calculator.subtract(a, b));
                break;
            case 3: // Multiply
                System.out.print("Enter two numbers: ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println("Result: " + calculator.multiply(a, b));
                break;
            case 4: // Divide
                System.out.print("Enter two numbers: ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println("Result: " + calculator.divide(a, b));
                break;
            case 5: // Square Root
                System.out.print("Enter a number: ");
                a = scanner.nextDouble();
                System.out.println("Result: " + calculator.sqrt(a));
                break;
            case 6: // Power
                System.out.print("Enter the base and the exponent: ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println("Result: " + calculator.power(a, b));
                break;
            case 7: // Mean
                ArrayList<Double> numbers = readNumbers(scanner);
                double[] numsArray = numbers.stream().mapToDouble(i -> i).toArray();
                System.out.println("Mean: " + calculator.mean(numsArray));
                break;
            case 8: // Variance
                numbers = readNumbers(scanner);
                numsArray = numbers.stream().mapToDouble(i -> i).toArray();
                System.out.println("Variance: " + calculator.variance(numsArray));
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 9.");
        }

    }

    public static ArrayList<Double> readNumbers(Scanner scanner) {
        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println("Enter numbers (type 'end' to finish):");
        while (true) {
            String input = scanner.next();
            if (input.equals("end")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'end' to finish.");
            }
        }
        return numbers;
    }
}
