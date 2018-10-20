package edu.dmacc.coma502.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test() {
		Student student = new Student("John Coffie", 1975, "Computer Science");
		assertEquals("John Coffie is majoring in Computer Science",
				student.toString());
	}
}
