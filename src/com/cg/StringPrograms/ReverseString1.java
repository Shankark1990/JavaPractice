package com.cg.StringPrograms;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome to CG";
		
		String[] str2=str.split(" ");
		
		for(int i=str2.length-1;i>=0;i--)
		{
			System.out.print(str2[i]+" ");
		}

	}

}
