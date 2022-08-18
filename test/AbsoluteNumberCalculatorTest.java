import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    @DisplayName("Test number = 0")
    void testFindAbsolute() {
        int number = 0;
        int expect = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("Test number = -1")
    void testFindAbsolute1() {
        int number = -1;
        int expect = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("Test number = 1")
    void testFindAbsolute2() {
        int number = 1;
        int expect = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expect, result);
    }
}