package collectionPrac;

import java.util.ArrayList;
import java.util.List;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li=new ArrayList<>();
		
		li.add("a");
		li.add("e");
		li.add("i");
		li.add("o");
		li.add("u");
		
		System.out.println(li);
		
		String[] str=new String[li.size()];
		
		str=li.toArray(str);
		
		System.out.println();

	}

}
