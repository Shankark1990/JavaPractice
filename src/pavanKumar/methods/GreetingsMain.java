package pavanKumar.methods;

public class GreetingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Greetings gr=new Greetings();
		
		gr.noParamNoReturnValue();
		System.out.println(gr.NoParamReturnValue());
		
		gr.TakesParamNoReturnValue(10, 20);
		System.out.println(gr.TakesParamReturnValue("Michael"));
	}

}
