package techelliptica;

import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Check Prime Number - Enter number: ");

		int number = scan.nextInt();
		boolean isPrime = true;

		if (number % 2 == 0) {
			System.out.println(number + " is not a prime number");
			scan.close();
		} else {

			for (int i = 2; i < (number) / 2; i = i + 2) {
				if (number % i == 0) {

					isPrime = false;
					break;

				}

			}

			if (isPrime)
				System.out.println(number + " is a prime number");
			else
				System.out.println(number + " is not a prime number");

			scan.close();

		}
	}

}
