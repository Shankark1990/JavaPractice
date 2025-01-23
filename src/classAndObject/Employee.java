package classAndObject;

/* Class -->
 * 			Class is a logical entity or blueprint 
 *			It is a collection of variables(Attributes) and methods(Behaviour)
 *			Class does not occupy space in the memory.
 * Object-->
 * 			Object is an instance of a class
 * 			It will be created by using class
 * 			Object is physical entity
 * 			Object occupy the space in the memory.
 * 			Multiple objects can be created for a single class.
 */

public class Employee {
	
	int eId;
	String eName;
	String eJob;
	int eSalary;
	
	
	void display() {
		System.out.println(eId);
		System.out.println(eName);
		System.out.println(eSalary);
		System.out.println(eJob);
		
	}

//	public static void main(String[] args) {
//		
//		ClassAndObjectsUsage obj =new ClassAndObjectsUsage();
//		
//		obj.eId=1560;     // assign value to variables using object.
//		obj.eName="John";
//		obj.eSalary=930000;
//		obj.eJob="Manager";
//		
//		obj.display();  // calling the method using object.
//
//	}

}
