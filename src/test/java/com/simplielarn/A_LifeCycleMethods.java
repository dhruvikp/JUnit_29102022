package com.simplielarn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class A_LifeCycleMethods {

	@BeforeAll
	static void initAll() {
		System.out.println("BeforeAll method invoked");
	}

	@BeforeEach
	void init() {
		System.out.println("Before Each method invoked");
	}

	@Test
	void test1() {

		System.out.println("Test1 executed");
	}

	@Test
	void test2() {
		System.out.println("Test2 executed");
	}

	@AfterEach
	void destroy() {
		System.out.println("After Each method invoked");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("AfterAll method invoked");
	}

}
