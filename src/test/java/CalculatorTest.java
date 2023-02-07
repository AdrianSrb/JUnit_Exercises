import ClassTest.Calculator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeClass
    public void setUp() {
         calculator = new Calculator();
    }

    @Test
    public void multiplication() {
        assertEquals(50, calculator.multiply(10,5));
    }

}
