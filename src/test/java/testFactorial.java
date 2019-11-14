import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testFactorial {
    @Test
    void testPositive() {
        Factorial factorial = new Factorial();
        int result = factorial.factorialcalc(8);
        assertEquals(result, 40320);

    }

    @Test
    void testNegative() {
        Factorial factorial = new Factorial();
        int result = factorial.factorialcalc(-5);
        assertEquals(result, 0);

    }

    @Test
    void testZero() {
        Factorial factorial = new Factorial();
        int result = factorial.factorialcalc(0);
        assertEquals(result, 1);

    }

    @Test

    void testFail() {
        Factorial factorial = new Factorial();
        int result = factorial.factorialcalc(0);
        assertEquals(0, 1);

    }
}
