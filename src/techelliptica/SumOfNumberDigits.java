package techelliptica;

public class SumOfNumberDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 123722987;
		int sum = 0;

//		sum=sum+i%10;
//		i=i/10;
//		
//		sum=sum+i%10;
//		i=i/10;
//
//		sum=sum+i%10;
//		i=i/10;
//		
//		sum=sum+i%10;
//		i=i/10;

		while (i != 0) {

			sum = sum + i % 10;
			i = i / 10;

		}

		System.out.println(sum);

	}

}
