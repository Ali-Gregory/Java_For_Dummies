import static java.lang.System.out;
import java.util.Scanner;

public class JustSwitchIt2 {
	//Customised to include exit command and to loop until exit command received
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		boolean exit = false;
		
		while (exit != true) {
			out.println("Which verse? (Type 'exit' to stop)");		
			String verse = keyboard.next();
			
			switch (verse) {
			case "1":
				out.println("That's because he has no brain.");
				out.println("Ohhhhhhhh. . . .");
				break;
			case "2":
				out.println("That's because he is a pain.");
				out.println("Ohhhhhhhh. . . .");
				break;
			case "3":
				out.println("'Cause this is the last refrain.");
				out.println("Ohhhhhhhh. . . .");
				break;
			default:
				out.println("No such verse. Try again.");
				break;
			case "exit":
				exit = true;
				break;
			}
		}
		out.println("Goodbye");	
		
	}

}
