package com.bptn.course._21_JUnit_books._week4_monday_examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorDemoTest {
	private ClaculatorTest calculator;

	@BeforeEach
	public void setup() {
		calculator = new ClaculatorTest();
	}

	@Test
	public void testAdd() {
		assertEquals(10, calculator.add(5, 5), "%5+% should equal 10");

	}

	@Test
	public void testSubtract() {
		assertEquals(10, calculator.subtract(15, 5), "15-5 should equal 10");
	}

}
