package collectionPrac;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> l1=new ArrayList<>();
		  
		 for(int i=0;i<10;i++)
		 {
			 l1.add(i);
		 }
		 ListIterator a=l1.listIterator();
		 while(a.hasNext())
		 {
			 System.out.println(a.next());
		 }
		 System.out.println("Reverse order: ");
		 while(a.hasPrevious())
		 {
			 System.out.println(a.previous());
			 
		 }
		 
		 
		 System.out.println("added 12 value");
		 while(a.hasNext())
		 {
			 System.out.println(a.next());
		 }
		 
	}

}
