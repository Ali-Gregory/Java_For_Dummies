package jUnit_demo;

public class Driver {
	  
	  public double velocity(TrafficLight light) {
	    switch (light.state) {
	    case RED:
	      return 0.0;
	    case YELLOW:
	      return 10.0;
	    case GREEN:
	      return 30.0;
	    default:
	      return 0.0;
	    }
	  }
	  
	}
