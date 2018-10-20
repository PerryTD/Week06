package edu.dmacc.coma502.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConeTest {
	@Test
	public void testConeVolume() {
		double radius = 5.2;
		double height = 11.5;
		Cone cone = new Cone(radius, height);
		double expectedVolume = 325.64;
		double actualVolume = cone.volume();
		assertEquals(expectedVolume, actualVolume, 0.01);
	}
	
	@Test
	public void testConeSurface() {
		double radius = 5.2;
		double height = 11.5;
		Cone cone = new Cone(radius, height);
		double expectedSurface = 291.13;
		double actualSurface = cone.surface();
		assertEquals(expectedSurface, actualSurface, 0.01);
	}
}
