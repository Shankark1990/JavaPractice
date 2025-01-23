package techelliptica;

import java.util.Scanner;

public class NumberOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double num1 = sc.nextInt();

		System.out.print("Enter second number: ");
		double num2 = sc.nextInt();
		
//		int num1=3/2;
//		int num2=4/2;
			

		// Addition of two numbers
		double sum = num1 + num2;
		System.out.println("Addition of two numbers is: " + sum);

		// Difference of two numbers
		double difference = num1 - num2;
		System.out.println("Difference of two numbers is: " + difference);

		// Product(multiplication) of two numbers
		System.out.println("Product of two numbers is :" + (num1 * num2));

		// Average of two numbers
		double avg = sum / 2;
		System.out.println("Average of two numnbers is: " + avg);

		// Distance of two numbers;
		double distance = Math.abs(difference);
		System.out.println("Distance of two number is: " + distance);

		// print maximum number
		if (num1 > num2)
			System.out.println("Maximum number between " + num1 + " and " + num2 + " is: " + num1);
		else
			System.out.println("Maximum number between " + num1 + " and " + num2 + " is: " + num2);

		// Print minimum number
		if (num1 < num2)
			System.out.println("Maximum number between " + num1 + " and " + num2 + " is: " + num1);
		else
			System.out.println("Maximum number between " + num1 + " and " + num2 + " is: " + num2);

	}

}
