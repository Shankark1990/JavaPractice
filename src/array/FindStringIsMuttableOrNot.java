package array;

public class FindStringIsMuttableOrNot {

	public static void main(String[] args) {

		String a = "abc";
		String b = a;
		a = a.concat("d");
		System.out.println(a);
		System.out.println(b);

		if (a.equals(b)) {
			System.out.println("a is mutable ");
		}
		else {
			System.out.println("a is immuatable");
		}

		StringBuffer c = new StringBuffer("abc");
		StringBuffer d = c;
		c.append("d");
		System.out.println(c);
		System.out.println(d);
		if (c.equals(d)) {
			System.out.println("C is mutable");
		} else
			System.out.println("C is immuttable..");

	}

}
