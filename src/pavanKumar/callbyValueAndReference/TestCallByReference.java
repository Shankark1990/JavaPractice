package pavanKumar.callbyValueAndReference;

public class TestCallByReference {
	
	int number=10;
	
	void m1(TestCallByReference t) {
		t.number=t.number+10;
		System.out.println("value in method: "+t.number);
	}
	
	public static void main(String[] args) {
		TestCallByReference ref=new TestCallByReference();
		System.out.println("CallByReference before method call: "+ref.number);
		
		ref.m1(ref);
		
		System.out.println("CallByReference after method call: "+ref.number);
	}

}
