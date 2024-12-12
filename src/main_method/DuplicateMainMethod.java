package main_method;

public class DuplicateMainMethod {

	void main() {
		System.out.println("Main method having no args");
	}

	void main(int a) {
		System.out.println("Main method having one arg: " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplicateMainMethod dm = new DuplicateMainMethod();

		dm.main();
		dm.main(10);

	}

}
