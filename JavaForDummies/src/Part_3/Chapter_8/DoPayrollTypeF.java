package Part_3.Chapter_8;

public class DoPayrollTypeF {
	
	public static void main(String args[]) {
		
		//Listing 8-8
		FullTimeEmployee ftEmployee = new FullTimeEmployee();
		
		ftEmployee.setName("Barry Burd");
		ftEmployee.setJobTitle("CEO");
		ftEmployee.setWeeklySalary(5000.00);
		ftEmployee.setBenefitDeduction(500.00);
		ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
		
		PartTimeEmployee ptEmployee = new PartTimeEmployee();
		
		ptEmployee.setName("Chris Apelian");
		ptEmployee.setJobTitle("Computer Book Author");
		ptEmployee.setHourlyRate(7.53);
		ptEmployee.cutCheck(ptEmployee.findPaymentAmount(50));
		
		PartTimeEmployee ptoEmployee = new PartTimeEmployee();
		
		ptoEmployee.setName("Steve Surace");
		ptoEmployee.setJobTitle("Driver");
		ptoEmployee.setHourlyRate(7.53);
		ptoEmployee.cutCheck(ptoEmployee.findPaymentAmount(50));
		
		//Listing 8-6
//		FullTimeEmployee ftEmployee = new FullTimeEmployee();
//		
//		ftEmployee.setName("Barry Burd");
//		ftEmployee.setJobTitle("CEO");
//		ftEmployee.setWeeklySalary(5000.00);
//		ftEmployee.setBenefitDeduction(500.00);
//		ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
//		System.out.println();
//		
//		PartTimeEmployee ptEmployee = new PartTimeEmployee();
//		
//		ptEmployee.setName("Steve Surace");
//		ptEmployee.setJobTitle("Driver");
//		ptEmployee.setHourlyRate(7.53);
//		ptEmployee.cutCheck(ptEmployee.findPaymentAmount(10));
	}
}
