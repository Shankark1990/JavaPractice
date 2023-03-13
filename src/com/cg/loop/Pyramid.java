package com.cg.loop;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<=4;i++)
		{
//			System.out.println("abc");
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");
		}
		
		int a=1;
		for(int i=4;i>=1;i--)
		{
//			System.out.println("abc");
			for(int j=0;j<=4-i;j++)
			{
				System.out.print(a);
				System.out.print("\t");
				a++;
				
			}
			System.out.println("");
		}
		
		

	}

}
