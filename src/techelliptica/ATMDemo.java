package techelliptica;

import java.util.Scanner;

public class ATMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Press 1 to check balance
//		Press 2 to deposit amount
//		Press 3 to withdraw amount
//		Press 4 to close transaction

		System.out.println("Welcome to HDFC ATM");
		boolean isContinue = true;
		int balance = 0;

		while (isContinue) {
			System.out.println("\n================");
			System.out.println("Press 1 - Check to Balance");
			System.out.println("Press 2 - Deposit Amount");
			System.out.println("Press 3 - Withdraw Amount");
			System.out.println("Press 4 - Exit");
			System.out.println("================\n");

			System.out.println("Please enter you choice: ");
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Your balance is: " + balance);
				break;
			case 2:
				System.out.println("Enter deposit amount: ");
				int amount = scan.nextInt();
				balance = balance + amount;
				System.out.println("Your amount " + amount + " added in your balance");
				break;
			case 3:
				System.out.println("Enter amount to withdraw: ");
				int withdrawAmt = scan.nextInt();
				balance = balance - withdrawAmt;
				System.out.println("You have withdrawn " + withdrawAmt + " and balance is " + balance);
				break;

			default:
				System.out.print("Successfully exit!");
				isContinue = false;
//				break;

			}

		}

	}

}
