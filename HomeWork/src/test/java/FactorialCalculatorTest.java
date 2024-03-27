import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorialForZero() {
        Assert.assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    public void testCalculateFactorialForPositiveNumber() {
        Assert.assertEquals(1, FactorialCalculator.calculateFactorial(1));
        Assert.assertEquals(2, FactorialCalculator.calculateFactorial(2));
        Assert.assertEquals(6, FactorialCalculator.calculateFactorial(3));
        Assert.assertEquals(24, FactorialCalculator.calculateFactorial(4));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorialForNegativeNumber() {
        FactorialCalculator.calculateFactorial(-1);
    }
}