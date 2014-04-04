import java.awt.Color;

public class e2_10 {
	public static void main(String[] args){
	
		Color temp = Color.RED; //creating a colour temp to the preset values of RED
		
		Color Dark = temp.darker(); //making temp darker once
		Color Darker = Dark.darker(); // making it darker twice
		
		String RGB = Darker.toString(); //sending the colour into a string format of RGB values
		
		System.out.println(RGB);
	
	
	
	}
}

