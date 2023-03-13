package series;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int r;
		int sum=0;
		int temp;
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		
		temp=n;
		
		while(n>0)
		{
			r=n%10; //getting reminder 
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("its palindrom");
		}
		else
		{
			System.out.println("its not palindrom");
		}

	}

}
