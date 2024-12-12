package logicalPrograms;

public class VerifyStringIsAPalindrom {

	public static void main(String[] args) {

//		Verify String is a palindrom

		String str = "Madam";
		System.out.println(str.length());

		String temp = "";
		char ch;
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(i);
			ch = str.charAt(i);
			temp = temp + ch;
		}
		System.out.println(temp);
		if (str.equalsIgnoreCase(temp))
			System.out.println(str + " is a palindrom string ");
		else
			System.out.println(str + " is not a palindrom string ");

		int n = 121;
		int rev = 0;
		int temp1 = n;

		while (temp1 > 0) {
			rev = rev * 10 + (temp1 % 10);
			temp1 = temp1 / 10;
		}
		if (n == rev) {
			System.out.println(n + " is a palindrom number");
		} else
			System.out.println(n + " is not a palindrom number");

	}

}
