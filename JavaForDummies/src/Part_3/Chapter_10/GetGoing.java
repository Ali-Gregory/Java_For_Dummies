package Part_3.Chapter_10;
//Listing 10-7
import static java.lang.System.out;

public class GetGoing {
	
	public static void main(String args[]) {
		
		out.println("main is running:");
		
		EnglishSpeakingWorld e = new EnglishSpeakingWorld();
		
//		out.println(mars);		//cannot resolve symbol
		out.println(e.mars);
		e.visitPennsylvania();
	}
}
