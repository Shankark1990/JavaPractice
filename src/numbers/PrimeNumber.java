package numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isPrime=true;
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp;
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println(num+" is a Prime number");
		}
		else
			System.out.println(num+ " is not a Prime number");

	}

}
