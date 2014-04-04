//Part of Question 3.15

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		// Creating the first outer black ring
		Ellipse2D.Double outerBring = new Ellipse2D.Double(10,5,100,100); // starting the target at position 10, 5 and width and height at 100
		g2.setColor(Color.BLACK);
		g2.fill(outerBring);
		g2.draw(outerBring);
		
		// Creating the outer white ring
		Ellipse2D.Double outerWring = new Ellipse2D.Double(20,15,80,80); // reducing the size by 20 each time and adjusting the position by increments of 10
		g2.setColor(Color.WHITE);
		g2.fill(outerWring);
		g2.draw(outerWring);
		
		// Creating the middle black ring
		Ellipse2D.Double midBring = new Ellipse2D.Double(30,25,60,60);
		g2.setColor(Color.BLACK);
		g2.fill(midBring);
		g2.draw(midBring);
		
		// Creating the inner black ring
		Ellipse2D.Double inerWring = new Ellipse2D.Double(40,35,40,40);
		g2.setColor(Color.WHITE);
		g2.fill(inerWring);
		g2.draw(inerWring);
		
		// Creating the centre of the target
		Ellipse2D.Double eye = new Ellipse2D.Double(50,45,20,20);
		g2.setColor(Color.BLACK);
		g2.fill(eye);
		g2.draw(eye);
	
	}

}