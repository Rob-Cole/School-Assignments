
public class Manager extends Employee {
	
	public String department;
	
	
	public Manager(String name, String dept, double salary){
		super(name,salary);
		department = dept;
	}
		
		public void setDepartment(String txt) {
		department = txt;
	}
	
	public String toStr() {
		String str = this.toString() + " department: " + department;
		
		return str;
	}
}
