package edu.dmacc.coma502.homework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BetterRectangle10Test {
	@Test
	public void testGetArea() {
		BetterRectangle10 rectangle = new BetterRectangle10(6, 9);
		assertEquals(54, rectangle.getArea(), 0.01);
	}
	
	@Test
	public void testGetPerimeter() {
		BetterRectangle10 rectangle = new BetterRectangle10(6, 9);
		assertEquals(30, rectangle.getPerimeter(), 0.01);
	}
}
