package array;

import java.util.ArrayList;
import java.util.List;

public class FindNumberWhoStartWithOne {

	public static void main(String[] args) {

		int arr[] = { 234, 4, 2, 11, 23, 25, 67, 87, 16, 117, 18 };

		List<Integer> numbers = new ArrayList<Integer>();

		for (int num : arr) {

			int n = getFirstDigits(num);
			if (n == 1) {
				numbers.add(num);
			}

		}

		System.out.println(numbers.toString());

	}

	public static int getFirstDigits(int num) {
		while (num >= 10) {
			num = num / 10;
		}
		return num;
	}

}
