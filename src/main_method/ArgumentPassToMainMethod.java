package main_method;

public class ArgumentPassToMainMethod {

	public static void main(String[] args) {

		for (String s : args) {

			System.out.println(s);
		}

		System.out.println("count of args: "+args.length);

	}

}
