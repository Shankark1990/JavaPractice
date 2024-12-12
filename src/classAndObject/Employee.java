package classAndObject;

public class Employee {

	int eId;
	String eName;
	String eJob;
	int eSalary;

	void display() {

		System.out.println(eId);
		System.out.println(eName);
		System.out.println(eJob);
		System.out.println(eSalary);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();

		emp1.eId = 101;
		emp1.eName = "Shankar";
		emp1.eJob = "SDET";
		emp1.eSalary = 1500000;

		emp1.display();

	}

}
