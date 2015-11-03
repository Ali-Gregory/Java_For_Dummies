package Part_2.Chapter_5;
import static java.lang.System.*;
import java.util.Scanner;

public class CheckPassword {
	
	public static void main(String args[]){
		out.print("What's the password?");
		
		Scanner keyboard = new Scanner(in);
		String password = keyboard.next();
		
		out.println("You typed >>" + password + "<<");
		out.println();
		
		if (password == "swordfish"){
			out.println("You are a hacker.");
		}
		else {
			out.println("Input isn't stored in the same place as real password");
		}
		out.println();
		
		if(password.equals("swordfish")){
			out.println("Password correct");
		}
		else {
			out.println("Password incorrect");
		}
	}
}
