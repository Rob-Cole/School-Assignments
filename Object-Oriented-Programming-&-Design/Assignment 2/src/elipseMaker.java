//Part of question 3.14

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class elipseMaker extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double ellipse = new Ellipse2D.Double(0,0,getWidth(),getHeight()); // gets the height and width dimensions of frame
		g2.draw(ellipse);
		g2.setColor(Color.BLUE);
		g2.fill(ellipse);
	
	}
}
