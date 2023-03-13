package com.cg.genericPractice;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test<Integer> obj1=new Test<Integer>();
		
		obj1.show(100);
		
		TwiceGenericType<Integer, String> tg=new TwiceGenericType<>();
		tg.input(12, "Shankar");
		
		tg.display();
		
		
	}

}
