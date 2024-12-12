package pavanKumar.keywords;

public class StaticDemo {
	
	int a=10;
	static int b=20;
	
	void m1() {
		System.out.println("this is m1 non-static method..,");
	}
	
	static void m2() {
		System.out.println("this is m2 static method....");
	}
	
	void m() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	

	
	
	public static void main(String[] args) {
		StaticDemo sd=new StaticDemo();
		sd.m();
	}

}
