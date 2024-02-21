import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 10);
        Assert.assertEquals(result, 15, "Addition result is incorrect");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 5);
        Assert.assertEquals(result, 5, "Subtraction result is incorrect");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 10);
        Assert.assertEquals(result, 50, "Multiplication result is incorrect");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        Assert.assertEquals(result, 5, "Division result is incorrect");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }

    @Test
    public void testNotEquals() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 5);
        Assert.assertNotEquals(result, 140, "Result should not be equal to 10");
    }

    @Test
    public void testAssertTrue() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assert.assertTrue(result > 4, "Result should be greater than 4");
    }

    @Test
    public void testAssertFalse() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 5);
        Assert.assertFalse(result < 0, "Result should not be negative");
    }

    @Test
    public void testNotNull() {
        Calculator calculator = new Calculator();
        Assert.assertNotNull(calculator, "Calculator object should not be null");
    }

    @Test
    public void testNull() {
        Calculator calculator = null;
        Assert.assertNull(calculator, "Calculator object should be null");
    }

    @Test
    public void testAssertSame() {
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = calculator1;
        Assert.assertSame(calculator1, calculator2, "Objects should be the same");
    }

    @Test
    public void testAssertNotSame() {
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        Assert.assertNotSame(calculator1, calculator2, "Objects should not be the same");
    }
}
