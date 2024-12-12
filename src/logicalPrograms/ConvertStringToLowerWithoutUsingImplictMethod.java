package logicalPrograms;

public class ConvertStringToLowerWithoutUsingImplictMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello ShankaR";
		char ch = ' ';
		String result = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				ch = (char) (str.charAt(i) + 32);
			} else {
				ch = (char) (str.charAt(i));
			}

			result += ch;
		}

		System.out.println(result);

		System.out.println((int) ('P'));

		char up = ' ';
		String upperCase = "";
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
				up = (char) (str.charAt(j) - 32);
			} else {
				up = (char) (str.charAt(j));
			}

			upperCase += up;
		}

		System.out.println(upperCase);

	}

}
