package logicalPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "intellectual";

		Map<Character, Integer> map = new TreeMap<>();

		char[] chArr = str.toCharArray();

		for (char ch : chArr) {

			if (map.containsKey(ch)) {

//				int value = map.get(ch);
//				value = value + 1;
//				map.put(ch, value);

				map.put(ch, (map.get(ch)) + 1);

			} else {
				map.put(ch, 1);
			}

		}

		System.out.println(map.toString());

	}

}
