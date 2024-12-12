package collectionPrac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
		ListIterator<Integer> it = list.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		list.add(12);
		
		ListIterator<Integer> add1 = list.listIterator();
		
		System.out.println("Added 12 value in list");
		while(add1.hasNext())
		{
			System.out.println(add1.next());
		}
		
		System.out.println("Getting value at index 3rd: "+list.get(2));
		System.out.println("Getting sublist from 1 to 4: "+list.subList(1, 5));
		
		list.set(2, 99);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		//list.sort(());
		
		
		
		
		
		
		
		
		

	}

}
