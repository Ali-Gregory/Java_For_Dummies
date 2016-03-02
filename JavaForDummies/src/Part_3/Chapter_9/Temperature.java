package Part_3.Chapter_9;
//Listing 9-2
public class Temperature {
	private double number;
	private TempScale scale;
	
	//Temperature constructors
	public Temperature() {
		number = 0.0;
		scale = TempScale.FAHRENHEIT;
	}
	public Temperature(double number) {
		this.number = number;
		scale = TempScale.FAHRENHEIT;
	}
	public Temperature(TempScale scale) {
		this.number = 0.0;
		this.scale = scale;
	}
	public Temperature(double number, TempScale scale) {
		this.number = number;
		this.scale = scale;
	}
	
	//Getter and setter methods for variables
	public void setNumber(double number) {
		this.number = number;
	}
	public double getNumber() {
		return number;
	}
	public void setScale(TempScale scale) {
		this.scale = scale;
	}
	public TempScale getScale() {
		return scale;
	}
}
