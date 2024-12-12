package array;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicateElementOfArray {
	public static void main(String[] args) {

		String findDuplicateElement[] = { "Goa", "Maharashtra", "Goa", "Delhi", "Maharashtra", "Karnatak", "Delhi",
				"Goa" };

		List<String> res = new ArrayList<>();

		for (int i = 0; i < findDuplicateElement.length; i++) {
			for (int j = i + 1; j < findDuplicateElement.length; j++) {
				if (findDuplicateElement[i] == findDuplicateElement[j]) {
					if (!res.contains(findDuplicateElement[i])) {
						res.add(findDuplicateElement[i]);
					}
				}
			}
		}

		System.out.println("List of Duplicate Element: " + res);
	}

}
