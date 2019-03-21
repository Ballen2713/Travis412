package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test(expected=java.lang.ArithmeticException.class)
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
		assertEquals(calc.minus(5, 3), 2);
		assertEquals(calc.multiply(0, 45), 0);
		assertEquals(calc.divide(2, 0), 1);
	}
}
