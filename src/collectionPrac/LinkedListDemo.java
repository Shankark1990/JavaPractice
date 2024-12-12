package collectionPrac;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList li=new LinkedList();
		
		li.add("e");
		li.add("i");
		li.add("o");
			
		li.addFirst("e");
		
		System.out.println(li);
		
		li.removeFirst();
		
		System.out.println(li);
		System.out.println(li.getLast());

	}

}
