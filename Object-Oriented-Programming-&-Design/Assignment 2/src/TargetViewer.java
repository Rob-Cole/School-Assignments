// Part of Question 3.15
import javax.swing.JFrame;

public class TargetViewer {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(200,200); // setting the initial size of the frame 
		frame.setTitle("BULLSEYE!"); // setting the title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		TargetComponent component = new TargetComponent();
		frame.add(component); // combines the target that is made in TargetComponent with the frame
		
		frame.setVisible(true);
	}
}
