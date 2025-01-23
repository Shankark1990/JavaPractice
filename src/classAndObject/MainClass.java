package classAndObject;

// Creating main class to call the method in another class using creating object of that class.

public class MainClass {

	public static void main(String[] args) {
		
		Employee obj =new Employee();
		
		obj.eId=1560;     // assign value to variables using object.
		obj.eName="John";
		obj.eSalary=930000;
		obj.eJob="Manager";
		
		obj.display();  // calling the method using object.

		
		Student st=new Student();
		st.sId=123;
		st.sName="Raj";
		st.grade='A';
		
		
		st.display();
		
		
		


	}

}
