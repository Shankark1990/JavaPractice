package com.cg.StringPrograms;

public class ReverseStringDemo {
	
	

	public static void main(String[] args) {
		String str="AutomationihdfjashfAutomationksdfjksdjfAutomationAutomation";
		String substr="Automation";
		System.out.println("Count of "+substr+" of \n" + findCount(str, substr));
	}
	
	public static int findCount(String s1, String s2)
	{
		if(s1.contains(s2))
		{
			return 1 + findCount(s1.replaceFirst(s2, ""), s2);
		}
		else {
			return 0;
		}
			
	}
}