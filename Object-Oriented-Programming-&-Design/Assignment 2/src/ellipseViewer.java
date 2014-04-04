//Part of question 3.14

import javax.swing.JFrame;

public class ellipseViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame(); 
		frame.setSize(150,250);
		frame.setTitle("My ellipse coloured blue");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		elipseMaker component = new elipseMaker(); // calls the ellipse maker to create the component
		frame.add(component); // component is added to the frave
		
		frame.setVisible(true);
		
	}
}