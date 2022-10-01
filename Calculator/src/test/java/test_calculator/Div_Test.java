package test_calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.miit.calculator.CalculatorFunction;

public class Div_Test {
	
	@Test
	public void test() {
		CalculatorFunction cf = new CalculatorFunction();
		assertEquals(8, cf.div(16, 2));
	}

}
