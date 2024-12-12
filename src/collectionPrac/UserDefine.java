package collectionPrac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserDefine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List li = new ArrayList<>();

		li.add(new Employee("A", 10));
		li.add(new Employee("B", 20));

		Iterator it = li.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

class Employee {
	private String name;
	private int id;

	public Employee(String n, int i) {
		name = n;
		id = i;
		//System.out.println(name+"  "+id);
		
	}
	
	public String toString() {
		return "Name: "+name+" Id: "+id;
	}

	
}