package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ele = { 23, 4, 22, 14, 7, 4, 99, 97 };

		Arrays.sort(ele);
		System.out.println(Arrays.toString(ele));

		Set<Integer> setArray = new HashSet<>();
		for (int i = 0; i < ele.length; i++) {

			setArray.add(ele[i]);
		}

		int[] removeDuplicates = Arrays.stream(ele).distinct().toArray();
		System.out.println(Arrays.toString(removeDuplicates));
		System.out.println("Second Smallest element is: " + removeDuplicates[1]);

	}

}
