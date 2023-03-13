package numbers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Numbers_btn_TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(between(1,11)));

	}
	
	private static int[] between(int i, int j) {
		// TODO Auto-generated method stub
		return IntStream.rangeClosed(i, j).toArray();
	}

	
}
