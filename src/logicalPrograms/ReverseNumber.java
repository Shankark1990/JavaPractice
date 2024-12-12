package logicalPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 211123;

		int rev_num = 0;

		while (number > 0) {
			rev_num = rev_num * 10 + number % 10;
			number = number / 10;

		}

		System.out.println("Reverse number of " + number + " is: " + rev_num);

	}

}
