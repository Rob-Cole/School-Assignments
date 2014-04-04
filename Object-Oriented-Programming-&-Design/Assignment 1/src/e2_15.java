
public class e2_15 {
	
	public static void main(String[] args)
	{
	 Picture pic = new Picture();
	 pic.load("QUEEN_MARY_534.jpg"); // loads the picture
	
	 int height = pic.getHeight();
	 int width = pic.getWidth();
	 
	 
	 int newHeight = height / 2;
	 int newWidth = width / 2;
	 
	 pic.scale(newWidth,newHeight); //converts the picture into half of the original height and width
	 pic.move((newWidth/2), (newHeight/2)); // moves the picture so that it has a frame.
}
}