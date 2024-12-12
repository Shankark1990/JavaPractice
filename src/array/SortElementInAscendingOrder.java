package array;

import java.util.Arrays;

public class SortElementInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 0;
		// First way
		int[] numbers = { 23, 44, 11, 45, 3, 22, 78, 101, 1, 2 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		// Second way

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}

			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
