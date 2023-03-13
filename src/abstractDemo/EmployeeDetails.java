package abstractDemo;

public abstract class EmployeeDetails {
	
	public void commonDetails(String name, int empID)
	{
		System.out.println("Employee name: "+name);
		System.out.println("Employee ID: "+empID);
	}
	
	public abstract void confidentialDetails(int a, String p);

}

