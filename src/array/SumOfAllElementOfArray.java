package array;

public class SumOfAllElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 23, 44, 11, 45, 3, 22, 78, 101, 1,2 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum of all element is: "+sum);

	}

}
