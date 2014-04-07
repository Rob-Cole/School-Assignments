import java.awt.Rectangle;

public class Question1 {
	
	public static void main(String[] args) {
		
	Rectangle box = new Rectangle(5,10,20,30); // setting the parameters to the rectangle given
	box.add(0,0); 
	
	System.out.println("expected results: x 0, y 0, 25, 40"); // prints out the expected results
	System.out.println("actual results: " + box.getBounds()); //retrieves the bounds of the new rectangle 
	
	}
	
	
}
	

