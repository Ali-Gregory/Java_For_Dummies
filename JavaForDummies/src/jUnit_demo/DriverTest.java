package jUnit_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DriverTest {

	@Test
	public void testVelocity() {
		TrafficLight light = new TrafficLight();
	    light.change(7);
	    Driver driver = new Driver();
	    assertEquals(30.0, driver.velocity(light), 0.1);  
	}

}
