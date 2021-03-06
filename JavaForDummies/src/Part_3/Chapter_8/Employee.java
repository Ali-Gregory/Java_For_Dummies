package Part_3.Chapter_8;

import static java.lang.System.out;

public class Employee {
	private String name;
	private String jobTitle;
	
	//Listing 8-1
	public void setName(String nameIn) {
		this.name = nameIn;
	}
	public String getName() {
		return name;
	}
	public void setJobTitle(String jobTitleIn) {
		this.jobTitle = jobTitleIn;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void cutCheck(double amountPaid) {
		out.printf("Pay to the order of %s ", name);
		out.printf("(%s) ***�", jobTitle);
		out.printf("%,.2f\n", amountPaid);
	}
}
