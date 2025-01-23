package pavanKumar.inheritance;

class Base {
	void base() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public void base() {
		System.out.println("Derived..");
	}
}

public class TE {

	public static void main(String[] args) {
		Derived d = new Derived();
		d.base();

	}

}
