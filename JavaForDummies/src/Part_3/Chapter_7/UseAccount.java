package Part_3.Chapter_7;

import static java.lang.System.out;

public class UseAccount {
	public static void main(String args[]) {
		Account myAccount = new Account();
		Account yourAccount = new Account();
		
		//Listing 7-9
		myAccount.setName("Barry Burd");
		myAccount.setAddress("222 Cyberspace Lane");
		myAccount.setBalance(24.02);
		
		yourAccount.setName("Jave Q. Public");
		yourAccount.setAddress("111 Consumer Street");
		yourAccount.setBalance(55.63);
		
		out.print(myAccount.getName());
		out.print(" (");
		out.print(myAccount.getAddress());
		out.print(") has £");
		out.println(myAccount.getBalance());
		
		out.print(yourAccount.getName());
		out.print(" (");
		out.print(yourAccount.getAddress());
		out.print(") has £");
		out.println(yourAccount.getBalance());
		
		//Removed for Listing 7-9
		/*myAccount.name = "Barry Burd";
		myAccount.address = "222 Cyberspace Lane";
		myAccount.balance = 24.02;
		
		yourAccount.name = "Jave Q. Public";
		yourAccount.address = "111 Consumer Street";
		yourAccount.balance = 55.63;*/
		
		//Listing 7-6
		/*myAccount.display();
		
		out.print(" plus £");
		out.print(myAccount.getInterest(5.00));
		out.println(" interest ");
		
		yourAccount.display();
		
		double yourInterestRate = 7.00;
		out.print(" plus £");
		double yourInterestAmount = 
				yourAccount.getInterest(yourInterestRate);
		out.print(yourInterestAmount);
		out.println(" interest ");*/
		
		//Listing 7-7
		/*myAccount.balance = 24.02;
		yourAccount.balance = 55.63;
		
		double myInterest = myAccount.getInterest(5.00);
		double yourInterest = yourAccount.getInterest(7.00);
		
		out.printf("£%4.2f\n",  myInterest);
		out.printf("£%5.2f\n",  myInterest);
		out.printf("£%.2f\n",  myInterest);
		out.printf("£%3.2f\n",  myInterest);
		out.printf("£%.2f £%.2f",  myInterest, yourInterest);*/
	}
}
