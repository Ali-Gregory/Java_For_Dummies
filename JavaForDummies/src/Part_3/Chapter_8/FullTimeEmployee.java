package Part_3.Chapter_8;

//Listing 8-3
public class FullTimeEmployee extends Employee{
	private double weeklySalary;
	private double benefitDeduction;

	public void setWeeklySalary(double weeklySalaryIn) {
		this.weeklySalary = weeklySalaryIn;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setBenefitDeduction(double benefitDedIn) {
		this.benefitDeduction = benefitDedIn;
	}
	public double getBenefitDeduction() {
		return benefitDeduction;
	}
	
	public double findPaymentAmount() {
		return weeklySalary - benefitDeduction;
	}
}
