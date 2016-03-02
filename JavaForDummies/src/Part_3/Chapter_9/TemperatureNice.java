package Part_3.Chapter_9;
//Listing 9-5
import static java.lang.System.out;

public class TemperatureNice extends Temperature {
	
	public TemperatureNice() {
		super();
	}
	public TemperatureNice(double number) {
		super(number);
	}
	public TemperatureNice(TempScale scale) {
		super(scale);
	}
	public TemperatureNice(double number, TempScale scale) {
		super(number, scale);
	}
	
	//Can leave off 'this.' from accessor methods
	public void display() {
		out.printf("%5.2f degrees %s \n", this.getNumber(), this.getScale());
	}
}
