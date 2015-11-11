package Part_3.Chapter_7;

import static java.lang.System.out;

public class Account {
	//Edited to be private for listing 7-8
	private String name;
	private String address;
	private double balance;
	
	/*public void display() {
		out.print(name);
		out.print(" (");
		out.print(address);
		out.print(") has £");
		out.print(balance);
	}
	
	public double getInterest(double percentageRate) {
		return balance * percentageRate / 100.00;
	}*/
	
	//Edited to include getters and setters in Listing 7-8
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
