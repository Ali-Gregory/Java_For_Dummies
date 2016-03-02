package Part_3.Chapter_9;
//Listing 9-9
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class SimpleFrame extends JFrame {
	
	//This is a constructor, it calls lots of methods from the Java API
	public SimpleFrame() {
		setTitle("Don't click the button!");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("Panic!"));
		setSize(300, 100);
		setVisible(true);
	}
}
