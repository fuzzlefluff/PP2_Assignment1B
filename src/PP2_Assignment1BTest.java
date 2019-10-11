import java.util.Scanner;

public class PP2_Assignment1BTest {

	public static void main(String[] args) {
		
		//variables to store user feedback to give to the SavingsAccount class
		double interest;
		double balance;
		int months;
		double withdrawl;
		double deposit;
		
		//Setup our scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt and store user input
		System.out.print("Please enter the account's annual interest rate: ");
		interest = input.nextDouble();
		System.out.print("Please enter the account's starting balance: ");
		balance = input.nextDouble();
		System.out.print("Please enter the account's age in months: ");
		months = input.nextInt();
		
		//create a new account object from user input
		SavingsAccount account = new SavingsAccount(balance, interest);
		
		
		//a for loop to iterate through the months of the account
		for(int c=1; c <= months; c++) 
		{
			//reset our withdrawl and deposit values so they don't change the account balance in the event the user doesn't input anything
			withdrawl = 0;
			deposit = 0;
			//ask the user for monthly input and store it
			System.out.print("Please enter the amount of withdrawls for month "+c+": ");
			withdrawl= input.nextDouble();
			System.out.print("Please enter the total of deposits for month"+c+": ");
			deposit = input.nextDouble();
			//feed the account object the user input and ask it to update it's balance accordingly
			account.withdrawal(withdrawl);
			account.deposit(deposit);
			account.addMonthInterest();
		}
		//print out the results of the program
		System.out.println();
		System.out.println("Your account balance is: "+ account.getBalance());
		System.out.println("You withdrew from your account: " + account.totalWithdrawl+" times");
		System.out.println("You deposited into your account: "+ account.totalDeposit +" times");
	}

}
