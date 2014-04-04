
public class Employee {

	private String name;
	private double salary;
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public void setSalary(double sal)
	{
		salary = sal;
	}
	
	public void setName(String nam)
	{
		name = nam;
	}
	
	public String toString()
	{
		String str = "name: " + name + " " + "salary: " + salary;
		return str;
	}
}
