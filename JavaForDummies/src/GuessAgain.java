import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessAgain {
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		int numGuesses = 0;
		int randomNum = new Random().nextInt(10) + 1;
		
		out.println("       ************         ");
		out.println("Welcome to the Guessing Game");
		out.println("       ************         ");
		out.println();
		
		out.println("Enter an int from 1 to 10: ");
		int inputNumber = keyboard.nextInt();
		numGuesses++;
		
		while (inputNumber != randomNum) {
			out.println();
			out.println("Try again...");
			out.println("Enter an int from 1 to 10: ");
			inputNumber = keyboard.nextInt();
			numGuesses++;
		}
		
		out.println("You win after " + numGuesses + " guesses.");
	}
}
