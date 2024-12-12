package logicalPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementBetweenTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Intarr1 = { 1, 3, 2, 5, 6, 7, 9, 43 };
		int[] Intarr2 = { 2, 1, 4, 6, 7, 8, 9, 12, 43 };

		findCommonElementinIntegerArray(Intarr1, Intarr2);

		String[] arr1 = { "Hello", "Shankar", "Great", "Target" };
		String[] arr2 = { "Target", "Inspire", "Great", "Shankar" };

		findCommonElementinStringArray(arr1, arr2);

	}

	public static void findCommonElementinStringArray(String[] arr1, String arr2[]) {

		Set<String> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equals(arr2[j])) {
					set.add(arr1[i]);
					break;
//					System.out.println(set.toString());
				}
			}
		}

		System.out.println(set.toString());
	}

	public static void findCommonElementinIntegerArray(int[] arr1, int arr2[]) {

		Set<Integer> setInt1 = new HashSet<>();
		Set<Integer> setInt2 = new HashSet<>();

		for (int i : arr1) {
			setInt1.add(i);
		}

		for (int j : arr2) {
			setInt2.add(j);
		}

		setInt1.retainAll(setInt2);

		System.out.println(setInt1);

	}

}
