package pavanKumar.callbyValueAndReference;

public class CallByValue {
	public static void main(String[] args) {
		Test t = new Test();

		int number = 10;
		System.out.println("Before calling the method: " + number);
		t.m1(number);

		System.out.println("After calling the method: " + number);

	}

}
