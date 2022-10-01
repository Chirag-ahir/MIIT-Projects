package test_calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.miit.calculator.CalculatorFunction;

public class Mul_Test {
	
	@Test
	public void test() {
		CalculatorFunction cf = new CalculatorFunction();
		assertEquals(36, cf.mul(9, 4));
	}

}
