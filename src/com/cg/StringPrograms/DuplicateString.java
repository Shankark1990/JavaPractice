package com.cg.StringPrograms;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1="AutomationsAutomationsdfkjdsfAutomation";
//		String substr="Automation";
		
		String str = new String("SakkettABSeSA");
		int count=0;
		
		
		
		char[] chars=str.toCharArray();
		System.out.println("Duplicate Characters are: ");
		
		for(int i=0; i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(chars[i]==chars[j])
				{
					System.out.println(chars[j]);
					count++;
					break;
				}
			}
		}

	}

}
