package Part_3.Chapter_8;
//Listing 8-5
public class PartTimeEmployee extends Employee{
	private double hourlyRate;

	public void setHourlyRate(double rateIn) {
		this.hourlyRate = rateIn;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}

	public double findPaymentAmount (int hours) {
		return hourlyRate * hours;
	}
}
