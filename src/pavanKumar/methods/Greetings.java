package pavanKumar.methods;

public class Greetings {
	
	void noParamNoReturnValue() {
		
		System.out.println("Hello...");
	}
	
	String NoParamReturnValue() {
		return "Return NoParamReturnValue...";
	}
	
	void TakesParamNoReturnValue(int a, int b) {
		System.out.println("Addition of a and b is: "+(a+b));
	}
	
	String TakesParamReturnValue(String name) {
		return "name is: "+name;
	}
	
	

}
