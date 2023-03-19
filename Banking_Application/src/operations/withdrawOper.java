package operations;

import java.util.Scanner;

public class withdrawOper  {

		public static double withdraw (double amount) {
			
			
		try 
		{
			
		System.out.print("Enter the Amount you want to withdraw Rs.");
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		double withdraw =scan.nextDouble();
		if(withdraw<amount)
		{
			amount=amount-withdraw;
			System.out.println("Rs."+ withdraw+" is withdraw from your Account");
			System.out.println("Current Available Balance in your saving account  is Rs."+ amount);
			System.out.println("-----------------------------------------------------------------------");
			return amount;
		}
		else
		{
			System.out.println("Low Balance");
			System.out.println("Current Available Balance in your saving account is Rs."+ amount);
			System.out.println("-----------------------------------------------------------------------");
			return amount;
		}
		}
		catch(Exception e) {
			System.out.println("Please enter Amount in form of digit ");
			System.out.println("-------------------------------------------------------------------------");
		}
		return amount;
		}
}

