package Part_3.Chapter_8;

//Listing 8-7
public class PartTimeWithOver extends PartTimeEmployee {
	@Override
	public double findPaymentAmount(int hours) {
		if (hours <=40) {
			return getHourlyRate() * hours;
		}
		else {
			return getHourlyRate() * 40 + getHourlyRate() * 2 * (hours - 40);
		}
	}

}
