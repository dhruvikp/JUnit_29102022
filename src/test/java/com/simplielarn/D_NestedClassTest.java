package com.simplielarn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("This is nested class test")
public class D_NestedClassTest {

	
	@Nested
	@DisplayName("This is inner class A")
	class A {
		
		@Test
		@DisplayName("This is test method from inner class")
		void test() {
			System.out.println("This is test from Nested class");
		}
	
	}
}
