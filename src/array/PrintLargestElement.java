package array;

public class PrintLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 23, 44, 11, 45, 3, 22, 78, 101 };
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max)
				max = numbers[i];

		}
		System.out.println("Maximum number is: " + max);
	}

}
