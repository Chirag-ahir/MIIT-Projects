package test_calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.miit.calculator.CalculatorFunction;

public class Add_Test {
	
	@Test
	public void test() {
		CalculatorFunction cf = new CalculatorFunction();
		assertEquals(20, cf.add(15, 5));
	}

}
