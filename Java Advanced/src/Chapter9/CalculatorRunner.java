package Chapter9;

public class CalculatorRunner {
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Test sum
        System.out.println("Sum of 5 and 3: " + calculator.sum(5, 3));

        // Test multiplication
        System.out.println("Product of 5 and 3: " + calculator.multiply(5, 3));

        // Test subtraction
        System.out.println("Difference between 5 and 3: " + calculator.subtract(5, 3));

        // Test division
        try {
            System.out.println("Division of 5 by 2: " + calculator.divide(5, 2));
            System.out.println("Division of 5 by 0: " + calculator.divide(5, 0)); // This will throw exception
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

