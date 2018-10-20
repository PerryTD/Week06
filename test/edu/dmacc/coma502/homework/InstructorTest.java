package edu.dmacc.coma502.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class InstructorTest {

	@Test
	public void testInstructorToString() {
		Instructor john = new Instructor("John Coffie", 1975, 10000);
		assertEquals("John Coffie makes $10000.00", john.toString());
	}
}
