package pavanKumar.inheritance;

class A1 {
	int a;

	void display() {
		System.out.println("Classs a value: " + a);
	}
}

class B1 extends A1 {
	int b;

	void show() {
		System.out.println("Class b value: " + b);
	}
}

class C1 extends B1 {
	int c;

	void print() {
		System.out.println("Class c value: " + c);
	}
}

public class MultiLevelInherityanceType {
	public static void main(String[] args) {

		C1 obj = new C1();
		obj.a = 10;
		obj.b = 20;
		obj.c = 30;

		obj.display();
		obj.show();
		obj.print();

	}

}

