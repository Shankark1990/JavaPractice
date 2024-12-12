package pavanKumar.inheritance;

class A{
	int a;
	void display() {
		System.out.println("Classs a value: "+a);
	}
}

class B extends A{
	int b;
	void show() {
		System.out.println("Class b value: "+b);
	}
}

public class SingleInheritanceType {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.a=10;
		obj.b=20;
		obj.display();
		obj.show();

	}

}
