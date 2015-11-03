package Part_2.Chapter_5;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter a whole number from 1 to 10: ");
		
		int inputNumber = keyboard.nextInt();
		int randomNumber = new Random().nextInt(10) + 1;
		
		if (inputNumber == randomNumber){
			out.println("*********");
			out.println("*You win*");
			out.println("*********");
		}
		else {
			out.println("You lose");
			out.print("The random number was " + randomNumber + ".");
		}
		
		out.println("Thank you for playing.");
		
	}
}
