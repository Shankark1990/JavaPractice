package array;

public class ConvertPrimitiveArrayToNonPrimitiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create primitive array
		int[] arr = { 23, 435, 232, 22, 39, 86, 44, 34 };

		// Define non-primitive array using primitive array length.
		Integer arr1[] = new Integer[arr.length];

		for (int i = 0; i < arr.length; i++) {
			// store element of primitive array to non-primitive array.
			arr1[i] = Integer.valueOf(arr[i]);
		}

		// print non-primitive array.
		for (Integer newObj : arr1) {
			System.out.println(newObj);
		}

	}

}
