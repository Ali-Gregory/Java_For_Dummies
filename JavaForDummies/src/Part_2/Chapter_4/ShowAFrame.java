package Part_2.Chapter_4;
import javax.swing.JFrame;

public class ShowAFrame {
	public static void main(String args[]) {
		JFrame myFrame = new JFrame();
		String myTitle = "Blank frame";
		
		myFrame.setTitle (myTitle);
		myFrame.setSize(300, 200);
		myFrame.setDefaultCloseOperation
			(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
}
