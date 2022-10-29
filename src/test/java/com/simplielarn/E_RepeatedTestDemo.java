package com.simplielarn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.simplilearn.Calculator;

@RunWith(JUnitPlatform.class)
public class E_RepeatedTestDemo {

	Calculator c;

	@BeforeEach
	void init() {
		c = new Calculator();
	}

	@Test
	@RepeatedTest(1000)
	void test() {
		Assertions.assertEquals(2, c.calculate(1, 1));
	}
}
