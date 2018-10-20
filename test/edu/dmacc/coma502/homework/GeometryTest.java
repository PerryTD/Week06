package edu.dmacc.coma502.homework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeometryTest {
	
	@Test
	public void testSphereVolume() {
		double radius = 5.2;
		double expectedVolume = 588.98;
		double actualVolume = Geometry.sphereVolume(radius);
		assertEquals(expectedVolume, actualVolume, 0.01);
	}
	
	@Test
	public void testSphereSurface() {
		double radius = 5.2;
		double expectedSurface = 339.79;
		double actualSurface = Geometry.sphereSurface(radius);
		assertEquals(expectedSurface, actualSurface, 0.01);
	}
	
	@Test
	public void testCylinderVolume() {
		double radius = 5.2;
		double height = 11.5;
		double expectedVolume = 976.91;
		double actualVolume = Geometry.cylinderVolume(radius, height);
		assertEquals(expectedVolume, actualVolume, 0.01);
	}
	
	@Test
	public void testCylinderSurface() {
		double radius = 5.2;
		double height = 11.5;
		double expectedSurface = 545.63;
		double actualSurface = Geometry.cylinderSurface(radius, height);
		assertEquals(expectedSurface, actualSurface, 0.01);
	}
	
	@Test
	public void testConeVolume() {
		double radius = 5.2;
		double height = 11.5;
		double expectedVolume = 325.64;
		double actualVolume = Geometry.coneVolume(radius, height);
		assertEquals(expectedVolume, actualVolume, 0.01);
	}
	
	@Test
	public void testConeSurface() {
		double radius = 5.2;
		double height = 11.5;
		double expectedSurface = 291.13;
		double actualSurface = Geometry.coneSurface(radius, height);
		assertEquals(expectedSurface, actualSurface, 0.01);
	}
}
