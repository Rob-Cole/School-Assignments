import java.awt.Color;

public class e2_8 {
	public static void main(String[] args){
	
		Color temp = new Color(50, 100, 150); // setting the colour to that given in the question
		Color temp2 = temp.brighter();
		
				
		String RGB = temp2.toString(); // converts the colour temp2 into a string format, which is in terms of the RGB values
		
		
		System.out.println(RGB); // prints RGB values
	
	
	
	}
}

