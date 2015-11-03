package Part_2.Chapter_4;
import static java.lang.System.out;

import java.util.Scanner;

public class MakeChange {
	
	public static void main(String args[]) {			
		int total;
		total = receiveInput();
		
//		int pound = total / 100;
//		int whatsLeft = total % 100;
		
		int fifty = total / 50;
		int whatsLeft = total % 50;
		
		int twenty = whatsLeft / 20;
		whatsLeft = whatsLeft % 20;
		
		int ten = whatsLeft / 10;
		whatsLeft = whatsLeft % 10;
		
		int five = whatsLeft / 5;
		whatsLeft = whatsLeft % 5;
		
		int two = whatsLeft / 2;
		whatsLeft = whatsLeft % 2;
		
		int pennies = whatsLeft;
		
		out.println("From " + total + " pennies, you get:");
//		out.println(pound + " pounds");
		out.println(fifty + " fifty pences");
		out.println(twenty + " twenty pences");
		out.println(ten + " ten pences");
		out.println(five + " five pences");
		out.println(two + " two pences");
		out.println(pennies + " pennies");
	}
	
	public static int receiveInput(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number of pennies: ");
		int n = reader.nextInt();
		return n;
	}
	
}
