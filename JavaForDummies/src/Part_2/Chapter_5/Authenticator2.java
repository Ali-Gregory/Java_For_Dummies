package Part_2.Chapter_5;
import static java.lang.System.out;
import java.util.Scanner;

public class Authenticator2 {
	
	public static void main(String args[]){
		Scanner keyboard = new Scanner (System.in);
		
		out.print("Username: ");
		String username = keyboard.next();
		
		if (username.equals("bburd")){
			out.println("Password: ");
			String password = keyboard.next();
			
			if (password.equals("swordfish")) {
				out.println("You're in!");
			}
			else {
				out.println("Incorrect password");
			}
		}
		else {
			out.println("Unknown user");
		}
	}

}
