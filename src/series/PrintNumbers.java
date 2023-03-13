package series;

public class PrintNumbers {

	public static void main(String[] args) {
		
		
		int[] numbers={5, 8, 4, 9, 7, 8, 2};
		for(int i=0;i<numbers.length;)
			{
				System.out.print(numbers[i]+" ");
				i=i+2;
			}
	}
}
