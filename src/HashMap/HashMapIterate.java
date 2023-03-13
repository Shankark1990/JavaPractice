package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Shankar");
		map.put(2, "Amrutraj");
		map.put(3, "Aavesh");

		System.out.println(map);

		Iterator it = map.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) it.next();
			System.out.println("Key is: " + me.getKey() + " Value is: " + me.getValue());
		}

		for (Map.Entry<Integer, String> m2 : map.entrySet()) {
			System.out.println("Key is: " + m2.getKey() + " Value is: " + m2.getValue());
		}

	}

}
