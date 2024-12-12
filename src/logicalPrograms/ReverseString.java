package logicalPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Knowledge";

		char ch;

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			ch = str.charAt(i);
			rev = rev + ch;
		}

		System.out.println("Reverse String: " + rev);

	}

}
