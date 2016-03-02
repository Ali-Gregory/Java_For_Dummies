package Part_3.Chapter_10;

import static java.lang.System.out;

public class EnglishSpeakingWorld2 {
	String mars;
	
	void visitidaho() {
		out.println("VisitID is running:");
		
		mars = " red planet";
		String atomicCity = " Population: 25";
		
		out.println(mars);
		out.println(atomicCity);
	}
	
	void visitNewJersey() {
		out.println("visitNJ is running");
		
		out.println(mars);
		//out.println(atomicCity);
		//	cannot resolve symbol
	}
}
