package jUnit_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrafficLightTest {

	@Test
	public void testNextState() {
		TrafficLight light = new TrafficLight();
		assertEquals(SignalColour.RED, light.state);
		light.nextState();
		assertEquals(SignalColour.GREEN, light.state);
		light.nextState();
		assertEquals(SignalColour.YELLOW, light.state);
		light.nextState();
		assertEquals(SignalColour.RED, light.state);
	}

	@Test
	public void testChange() {
		TrafficLight light = new TrafficLight();
		light.change(5);
		assertEquals(SignalColour.YELLOW, light.state);
	}

}
