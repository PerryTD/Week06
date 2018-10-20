package edu.dmacc.coma502.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPersonToString() {
		Person person = new Person("John Coffie", 1975);
		assertEquals("John Coffie", person.toString());
	}
}
