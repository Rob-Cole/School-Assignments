
public class RectangleTester {
	public static void main(String[] args)
	{
		Rectangle small = new Rectangle("a",5,5);
		Rectangle large = new Rectangle("b",10,10);
		
		System.out.println("Expected: b");
		System.out.println("Results: " + small.getLargest(large));
	}
}
