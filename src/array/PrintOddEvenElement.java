package array;

public class PrintOddEvenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ele = { 4, 5, 3, 7, 33, 22, 11, 6, 9 };

		for (int i = 0; i < ele.length; i++) {
			
			if(ele[i]%2==0)
				System.out.println(ele[i]+" is even number");
			else
				System.out.println(ele[i]+" is odd number");

		}

	}

}
