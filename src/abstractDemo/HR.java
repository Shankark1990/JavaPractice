package abstractDemo;

public class HR extends EmployeeDetails{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HR hr=new HR();
		hr.confidentialDetails(5000000, "Excellent");
		hr.commonDetails("Shankar", 2341);

	}

	@Override
	public void confidentialDetails(int a, String p) {
		// TODO Auto-generated method stub
		System.out.println("Employee Salary is: "+a);
		System.out.println("Employee performance is: "+p);
	}
	

}
