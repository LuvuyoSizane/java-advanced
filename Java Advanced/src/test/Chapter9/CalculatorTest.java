package Chapter9;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
       static Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(8, calculator.sum(5, 3));
        assertEquals(-1, calculator.sum(2, -3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(5, calculator.subtract(2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2), 0.01);
        assertEquals(-1.0, calculator.divide(5, -5), 0.01);

        // Test divide by zero
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }

    @AfterAll
    static void tearDown(){
       calculator = null;
    }
}
