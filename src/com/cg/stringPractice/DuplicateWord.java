package com.cg.stringPractice;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "AutomationskdfjdskfjAutomationAutomationAutomationsdf";
		String substr = "Automation";

		System.out.println("Count of Automation is: " + substr_count(str, substr));

	}

	static int substr_count(String str, String sub) {
		if (str.contains(sub)) {
			return 1 + substr_count(str.replaceFirst(sub, ""), sub);
		}
		return 0;
	}

}
