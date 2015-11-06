package jUnit_demo;

public class TrafficLight {
	  SignalColour state = SignalColour.RED;
	 
	  public void nextState() {
	    switch (state) {
	    case RED:
	      state = SignalColour.GREEN;
	      break;
	    case YELLOW:
	      state = SignalColour.RED;
	      break;
	    case GREEN:
	      state = SignalColour.YELLOW;
	      break;
	    default:
	      state = SignalColour.RED;
	      break;
	    }
	  }
	  
	  public void change(int numberOfTimes) {
	    for (int i = 0; i < numberOfTimes; i++) {
	      nextState();
	    }
	  }
	}