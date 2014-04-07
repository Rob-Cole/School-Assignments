


public class EmployeeTester {
	public static void main (String args[]) {
		Employee test = new Employee("Honest Abe", 1);
		Manager test2 = new Manager("Andrew Jackson", "Battlefield Commander", 20);
		Executive test3  = new Executive ("Ben Franklin", "Scienctist", 100);
		
		System.out.println(test.toString());
		System.out.println(test2.toStr());
		System.out.println(test3.toStr());
	}
}
