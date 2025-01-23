package techelliptica;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		int c = 3;

		if (a++ == 1 && ++b == 3) {

		} else if (b++ == 3 || c++ == 3) {

		} else {

		}

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		int in = 1234_23;

		System.out.println(in);
		
		double db1=14.5d;
		db1++;
		System.out.println(db1);
		
		boolean bool=true;
//		bool++;
		
		int i=10;
		
		int j=i++ + ++i;
		
		System.out.println(i);
		System.out.println(j);

	}

}
