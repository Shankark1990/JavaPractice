package collectionPrac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Convert primitive datatypes to Object
		int a=20;
		Integer b=a; //Autoboxing
		b=b+10; //Unboxing
		System.out.println("Value of a: "+a+"\nValue of b: "+b);
		
		
		//TypeCasting - 
		int y=10;
		float z=y;
		System.out.println("Windening typecasting: "+z);
		
		double k=12.99;
		int j=(int)k;
		System.out.println("Narrowing typecasting: "+j);
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=1;i<=5;i++)
		{
			list.add(i);
		}
		System.out.println("List elements are: "+list);
		
		list.remove(2);
		System.out.println("Removed element of index 2 from List: "+list);
		System.out.println("Get index of 3 is: "+list.get(3));
		list.set(2, 10);
		System.out.println("Setting value 10 at index 2: "+list);
		
		System.out.println("Is 10 present in list: "+list.contains(10));
		
		list.remove(0);
		System.out.println("Removing value of index 0: "+list);
		
	
		Set<String> st = new HashSet<>();
		st.add("a");
		st.add("e");
		st.add("i");
		st.add("o");
		st.add("u");
		System.out.println(st);
		st.add("a");
		System.out.println(st);
		st.remove("a");
		System.out.println(st);
		
		
		List<Integer> li = new LinkedList<>();
		
		for(int i=0;i<10;i++)
		{
			li.add(i);
		}
		
		System.out.println("List elements are: "+li);
		
		li.add(1);
		System.out.println("Adding duplicate value 1: "+li);
		
		LinkedList lst=new LinkedList();
		
		

	}

}
