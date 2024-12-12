package pavanKumar.callbyValueAndReference;

public class Test {

	int number;
	String name;

	void m1(int number) {
		number = number + 10;

		System.out.println("M1 method from" + number);

	}
	
	void callByReference(Test t) {
		number=t.number+10;
//		name=t.name+" welcome";
	}

}
