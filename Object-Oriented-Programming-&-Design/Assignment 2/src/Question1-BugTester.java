//Part of Question 3.12
public class BugTester {
	public static void main(String[] args)
	{
		Bug bugsy = new Bug(10); // creating a bug using the bug function
		bugsy.move(); // testing the move function
		
		System.out.println(bugsy.getPosition()); //testing the get position function
		System.out.println("Expected: 11");
		
		bugsy.turn(); // testing the turn function 
		bugsy.move();
		
		System.out.println(bugsy.getPosition());
		System.out.println("Expected: 10");
		
	}
}
