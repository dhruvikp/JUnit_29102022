package com.simplielarn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.simplilearn.Calculator;

@RunWith(JUnitPlatform.class)
public class C_CalculatorTest {

	Calculator c;
	
	@BeforeEach
	void intEach() {
		c = new Calculator();
	}
	
	@Test
	void test_addition_when_both_positive() {
	
	// STEP 1 : DEFINE INPUTS
		int a = 1;
		int b = 1;
		
	// STEP 2: Invoke Actual method and gets actual value
		int actual = c.calculate(a, b);
		
	// STEP 3: Define Expected value
		int expected = 2;
		
	// STEP 4: Assert Actual with expected.
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void test_addition_when_both_negative() {
	
	// STEP 1 : DEFINE INPUTS
		int a = -1;
		int b = -1;
		
	// STEP 2: Invoke Actual method and gets actual value
		int actual = c.calculate(a, b);
		
	// STEP 3: Define Expected value
		int expected = -2;
		
	// STEP 4: Assert Actual with expected.
		Assertions.assertEquals(expected, actual);
	}
}
