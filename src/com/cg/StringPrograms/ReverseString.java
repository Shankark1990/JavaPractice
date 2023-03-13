package com.cg.StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Automation";
		
		char[] chars=str.toCharArray();
		System.out.println( "Original string is: "+str );
		System.out.print("Reversed string is: ");
		
		for(int i = chars.length-1; i>=0; i--)
		{
			System.out.print(chars[i]);
			
		}

	}

}
