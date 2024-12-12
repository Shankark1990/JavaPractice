package collectionPrac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "A");
		map.put(1, "B");
		map.put(1, "C");
		map.put(1, "D");
		map.put(1, "E");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey());
		}

	}

}
