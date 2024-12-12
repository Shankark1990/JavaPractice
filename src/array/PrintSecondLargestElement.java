package array;

import java.util.Arrays;

public class PrintSecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 23, 44, 65, 33, 278, 90, 66, 44 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Second Largest number is: "+arr[arr.length-2]);

	}

}
