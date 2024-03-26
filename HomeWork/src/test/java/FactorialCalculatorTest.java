import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorialForZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    public void testCalculateFactorialForPositiveNumber() {
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
        assertEquals(2, FactorialCalculator.calculateFactorial(2));
        assertEquals(6, FactorialCalculator.calculateFactorial(3));
        assertEquals(24, FactorialCalculator.calculateFactorial(4));
    }

    @Test
    public void testCalculateFactorialForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.calculateFactorial(-1);
        });
    }
}
