package pavanKumar.string;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {

		String s = "Welcome";

		System.out.println(s.length()); // Here length() is a method to find size of string

		String[] a = { "Hello", "Shankar" };
		System.out.println(a.length); // Here length is a keyword to find size of an array.

//		concat() - combine/jone multiple strings
		String s1 = " to Java";
		String s2 = " World";

		System.out.println(s.concat(s1).concat(s2));

//		trim() - remove the spaces of right and left sides.
		String tr = "   trim   ";
		System.out.println("Before trimming: " + tr.length());
		String tr1 = tr.trim();
		System.out.println("After trimming: " + tr1.length());

//		charAt() - returns a character based on index

		String charA = "Welcome";
		System.out.println("Return char of index 5 from Welcome: " + charA.charAt(5));

//		contains() - It returns true/false - Checks a string is part of main string
		System.out.println("is Wel contains in Welcome?: " + charA.contains("Wel"));
		System.out.println("is Com contains in Welcome?: " + charA.contains("Com")); // return false because it's case
																						// sensative.

//		equals(), equalIgnorecase() - return true or false

		System.out.println("Equal method: " + s1.equals(s2)); // - return true or false

//		replace() - replace single or sequance of character.

		String r1 = "Welcome to java world";

		System.out.println("Replace method: " + r1.replace("w", "X"));
		System.out.println("Replace method sequance char: " + r1.replace("java", "python"));
		System.out.println("Replace method: " + r1.replace("Wel", "Boss"));

//		subString() - Extract substring from the main string

		System.out.println("Substring: " + r1.substring(0, 3));

//		toUpperCase(), toLowerCase() --> convert string to upper and lower case.
//		split() -> split/divide the string in to multiple part based on delimeter.

		String s12 = "abc@123";
		String sl[] = s12.split("@");

		System.out.println("Splitting the string abc@123 by delimeter @: " + sl[0] + " " + sl[1]);
		System.out.println(Arrays.toString(sl)); // --> getting error.
		String amt = "$12,234,34";
		System.out.println("Remove '$' & ',' from $12,234,34: " + amt.replace(",", "").replace("$", ""));

		String task = "abc,123";
		String arr[] = task.split(",");
		System.out.println(Arrays.toString(arr));

		String name = "John Roger";
		System.out.println(name.toLowerCase().contains("john"));
//		reverse() --> Reverse the string
		// Logic-1
		String temp = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			temp = temp + name.charAt(i);

		}
		System.out.println("Reverse String Logic-1__using charAt(): " + temp);

		// Logic-2
		char ch[] = name.toCharArray(); // convert string to character type
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println("Reverse String Logic-2__using toCharArray(): " + rev);
		
		//Logic - 3 using StringBuffer class
		StringBuffer sb=new StringBuffer("Reverse");
		System.out.println("Reverse Logic-3 using StringBuffer: "+sb.reverse());
		
		//Logic - 3 using StringBuilder class
		StringBuilder sb1=new StringBuilder("StringBuilder");
		System.out.println("Reverse String logic-4 using StringBuilder: "+sb1.reverse());
		
//		****************************************************************************************
		// String Comparison
		// == double equals operator used for comparing based on objects.
		//equals() method used for comparing based on values
		
		//CASE-1
		String cp1="abc";
		String cp2="abc";
		System.out.println(cp1==cp2); //True 
		System.out.println(cp1.equals(cp2));//True
		
		//CASE-2
		String cp3=new String("abc"); 
		String cp4=new String("abc");
		System.out.println(cp3==cp4); //false - Objects are diff
		System.out.println(cp3.equals(cp4)); // true - values are same.
		
		//CASE-3
		String cp5="abc";
		String cp6=new String("abc");
		System.out.println(cp5==cp6); //false 
		System.out.println(cp5.equals(cp6)); //true
		
		//CASE-4
		String cp7="abc";
		String cp8=new String("abc");
		String cp9=cp8;
		
		System.out.println(cp7==cp8); //false
		System.out.println(cp7.equals(cp8)); // true
		System.out.println(cp7==cp9); //true - object are same
		
//		Mutable Vs Immutable 
		/*
		 * Mutable --> can be changed value
		 * Immutable --> can't change value
		 * 
		 * String is Immutable 
		 * StringBuffer is mutable 
		 * StringBuilder is mutable
		 *
		 **/
	}

}
