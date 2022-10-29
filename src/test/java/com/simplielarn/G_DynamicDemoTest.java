package com.simplielarn;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.simplilearn.Calculator;

@RunWith(JUnitPlatform.class)
public class G_DynamicDemoTest {

	
	Calculator c;
	
	@BeforeEach
	void init() {
		c = new Calculator();
	}

	@TestFactory
	Collection<DynamicTest> dynamicTests() {
		Collection<DynamicTest> dynamicTests  = new ArrayList<DynamicTest>();
		dynamicTests.add(DynamicTest.dynamicTest("When Both Argument positive", () -> Assertions.assertEquals(2, c.calculate(1, 1))));
		dynamicTests.add(DynamicTest.dynamicTest("When Both Argument negative", () -> Assertions.assertEquals(-2, c.calculate(-1, -1))));
		dynamicTests.add(DynamicTest.dynamicTest("When One is zero and another is positive", () -> Assertions.assertEquals(1, c.calculate(0, 1))));
		return dynamicTests;
	}
}