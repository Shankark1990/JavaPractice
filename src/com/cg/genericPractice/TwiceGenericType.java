package com.cg.genericPractice;

public class TwiceGenericType<X,Y> {
	
	X x;
	Y y;
	
	public void input(X x, Y y)
	{
		this.x=x;
		this.y=y;
		
	}
	public void display()
	{
		System.out.println("X = "+x+","+" Y = "+y);
	}

}
