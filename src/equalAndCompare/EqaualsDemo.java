package equalAndCompare;

public class EqaualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		String s2="Hello";
		String s3="Helo";
		
		int a=12;
		int b=12;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));;
		
//		System.out.println(a.equals(b)); Cannot not use on primitive data types
//		System.out.println(a==b); 
//		System.out.println(a.compareTo(b));Cannot not use on primitive data types
		
		System.out.println();

	}

}
