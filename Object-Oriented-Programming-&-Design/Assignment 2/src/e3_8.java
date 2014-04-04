import java.util.Scanner;


public class e3_8 {
	/* This is the tester for the Employee class where the user can input test the method of Employee by entering what they
	 * desire in each field. See Employee file for the inner workings of the Employee method.*/

	public static void main(String[] args)
	{
		Double salary;
		String name;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a name in the format of 'Last, First': ");
		name = sc.next();
		System.out.print("Enter a Salary: ");
		salary = sc.nextDouble();
		
		Employee test = new Employee(name,salary);
		
		System.out.println("testing getName...");
		System.out.println(test.getNames());
		System.out.println("Expected: " + name);
		System.out.println("testing getSalary...");
		System.out.println(test.getSalary());
		System.out.println("Expected: " + salary);
		System.out.print("Enter the desired percent raise of salary: ");
		
		double percent = sc.nextDouble();
		test.raiseSalary(percent);
		salary = salary * ((percent/100)+1);
		
		System.out.println(test.getSalary());
		System.out.println("Expected: " + salary);
		
	}
				
}
