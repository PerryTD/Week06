package edu.dmacc.coma502.homework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SphereTest {

	@Test
	public void testSphereVolume() {
		double radius = 5.2;
		Sphere sphere = new Sphere(radius);
		double expectedVolume = 588.98;
		double actualVolume = sphere.volume();
		assertEquals(expectedVolume, actualVolume, 0.01);
	}
	
	@Test
	public void testSphereSurface() {
		double radius = 5.2;
		Sphere sphere = new Sphere(radius);
		double expectedSurface = 339.79;
		double actualSurface = sphere.surface();
		assertEquals(expectedSurface, actualSurface, 0.01);
	}
}
