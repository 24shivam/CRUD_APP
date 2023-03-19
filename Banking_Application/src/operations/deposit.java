package operations;

import java.util.Scanner;

public class deposit {

	public static double DepositMoney(double amount) 
		{
		try 
		{
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		System.out.print("Please Enter the amount to Deposit Rs.");
		
		double deposit =scan.nextDouble();
		amount =amount+ deposit;
		System.out.println("Rs."+deposit+" is deposited into your Account");
		System.out.println("Current Available Balance in your saving account is Rs."+ amount);
		System.out.println("-----------------------------------------------------------------------");
		}
		catch(Exception e) {
			System.out.println("Please enter Amount in form of digit ");
			System.out.println("-------------------------------------------------------------------------");
		}
		return amount;
		
		}
}
