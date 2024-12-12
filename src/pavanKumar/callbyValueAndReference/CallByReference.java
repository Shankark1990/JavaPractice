package pavanKumar.callbyValueAndReference;

public class CallByReference {

//	int number=10;

	public static void main(String[] args) {

		Test t = new Test();

		t.number = 10;
//		t.name = "John";

		System.out.println("CallByReference before calling method: " + t.number);
		t.callByReference(t);

		System.out.println("CallByReference after calling method: " + t.number);

	}

}
