public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero.");
        return a / b;
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double mean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public double variance(double[] numbers) {
        double mean = mean(numbers);
        double sum = 0;
        for (double num : numbers) {
            sum += Math.pow(num - mean, 2);
        }
        return sum / numbers.length;
    }
}
