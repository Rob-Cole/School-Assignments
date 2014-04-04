// Part of Question 3.8

public class Employee {

	private String name;
	private double salary;
	
	public Employee(String employeeName, double currentSalary)
	{
		name = employeeName;
		salary = currentSalary;
		/** Records the employee's name and current salary.
		 * @param the name of the employee and their current salary		 */
	}
	
	public void raiseSalary(double percent)
	{
		salary = salary * ((percent / 100) + 1);
		/** a process of increasing the employee's wages by a percentage.
		 * @param the percent of increase to their salary		 */
	}
	
	public String getNames()
	{
		return name;
		/** retrieves the employee's name from the Employee variable type.
		 */
	}
	
	public double getSalary()
	{
		return salary;
		/** retrieves the employee's salary from the Employee variable type.
		 */
	}
}
