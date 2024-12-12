package logicalPrograms;

import java.util.Arrays;

public class PrintFirstWordOfString {

	public static void main(String[] args) {
		// Print first letter of each word in a string

		String str = "Luck is what happen when preparation meets requirement";

		String spl[] = str.split(" ");

		System.out.println(Arrays.toString(spl));

		for (int i = 0; i < spl.length; i++) {

			System.out.println(spl[i].charAt(0));

		}

	}

}
