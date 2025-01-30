package Chapter9;

public class Calculator {

    // Method for addition
    public int sum(int a, int b) {
        return a + b;
    }

    // Method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method for division with error handling for divide by zero
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) a / b;
    }
}
