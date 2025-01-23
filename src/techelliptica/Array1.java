package techelliptica;

import java.util.Arrays;

public class Array1 {

	public static void m1(int[] arr, int index) {
		if (index >= arr.length - 1) {
			return;
		}

		if (arr[index] % 2 == 0 && arr[index] % 2 != 0) {
			int temp = arr[index];
			arr[index] = arr[index + 1];
			arr[index + 1] = temp;
		}

		m1(arr, index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 1, 6, 3, 8, 7 };
		m1(arr, 0);
		System.out.println(Arrays.toString(arr));

	}

}
