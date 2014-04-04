import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;



public class Geometry {
	
	

	// using the equation (x1-x2)^2/(Rx)^2+(y1-y2)^2/(Ry)^2  to determine whether or not the point is on or in the ellipse.
	public static boolean isInside(Point2D.Double p, Ellipse2D.Double e){
		// if the return value is less than or equal to 1, the point is in the ellipse;
		if (Math.pow(p.getX()-e.getCenterX(),2)/Math.pow(e.getWidth()/2,2)+Math.pow(p.getY()-e.getCenterY(),2)/Math.pow(e.getHeight()/2,2) <=1) return true;
	return false;
	}
	
	public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e){
		// if the return value is equal to 1 + or - epsilon then the point is on the ellipse;
		if (Math.floor(Math.pow(p.getX()-e.getCenterX(),2)/Math.pow(e.getWidth()/2,2)+Math.pow(p.getY()-e.getCenterY(),2)/Math.pow(e.getHeight()/2,2)) == 1) return true;
	return false;
	}

public static void main (String [] args){
	
	Ellipse2D.Double e = new Ellipse2D.Double(0,0,100,200);
	Point2D.Double p = new Point2D.Double(100,100);
	
	if (isInside(p,e)== true) System.out.print("true");
	else System.out.print("false");
	
	if (isOnBoundary(p,e) == true) System.out.print("true");
	else System.out.print("false");
}
}