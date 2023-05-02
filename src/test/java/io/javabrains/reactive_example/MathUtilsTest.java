package io.javabrains.reactive_example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.javabrains.testDriven.MathUtils;

public class MathUtilsTest {
	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 1;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add two numbers");

	}

	@Test
	void testComputerCircleArea() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(Math.PI*100, mathUtils.computeCircleArea(10.0));
	}

}
