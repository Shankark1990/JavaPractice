package techelliptica;

public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		String s1 = "abc";
		String s2 = s1 + "sd";
		String s3 = s1 + "asdf";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		int i=13;
		System.out.println(~i);

	}

}
