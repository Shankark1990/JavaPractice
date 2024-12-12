package array;

import java.util.ArrayList;
import java.util.List;

public class PrintElementOfArrayInReverse {

	public static void main(String[] args) {

		String printElementInReverseOrder[] = { "Goa", "Maharashtra", "Karnatak", "Delhi" };
		List<String> rev = new ArrayList<>();

		for (int i = printElementInReverseOrder.length - 1; i >= 0; i--) {

			if (!rev.contains(printElementInReverseOrder[i])) {
				rev.add(printElementInReverseOrder[i]);
			}

		}
		System.out.println("List of element in reverse order: " + rev);
	}

}
