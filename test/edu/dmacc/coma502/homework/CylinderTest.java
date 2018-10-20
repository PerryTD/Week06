package edu.dmacc.coma502.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {

	@Test
	public void testVolume() {
		double radius = 5.2;
		double height = 11.5;
		Cylinder cylinder = new Cylinder(radius, height);
		double expectedVolume = 976.91;
		double actualVolume = cylinder.volume();
		assertEquals(expectedVolume, actualVolume, 0.01);
	}
	
	@Test
	public void testSurface() {
		double radius = 5.2;
		double height = 11.5;
		Cylinder cylinder = new Cylinder(radius, height);
		double expectedSurface = 545.63;
		double actualSurface = cylinder.surface();
		assertEquals(expectedSurface, actualSurface, 0.01);
	}
}
