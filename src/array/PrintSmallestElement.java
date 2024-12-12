package array;

public class PrintSmallestElement {
	public static void main(String[] args) {

		int[] numbers = { 23, 44, 11, 45, 3, 22, 78, 101, 1 };

		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < min)
				min = numbers[i];

		}
		System.out.println("Smallest number is : " + min);

	}

}
