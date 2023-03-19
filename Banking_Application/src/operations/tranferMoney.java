package operations;

import java.util.Scanner;

public class tranferMoney {
	
	public static double Send(double amount)
	
	{
		try {
			
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true) 
		{
		System.out.print("Enter the Amount to send Rs.");
		double send =scan.nextDouble();
		
		if(send<amount) 
		{
		System.out.println("Select the option for sending Money\n 1.Mobile Number \n 2.Bank Account");
		System.out.println("-----------------------------");
		
		double x =scan.nextDouble();
		
		if(x==1) 
		{
			System.out.println("Please Enter the mobile Number");
			Long num = scan.nextLong();
			if(num<10000000000d && num>999999999d) {
				amount =amount- send;
			System.out.println("Rs."+send+" is send to mobie number "+num);
			System.out.println("Current Available Balance is Rs."+ amount);
			System.out.println("-----------------------------------------------------------------------");
		   }
			else{
				System.out.println("Entered Mobile no. is not valid Please Try again");
				System.out.println("-----------------------------------------------------------------------");
				continue;
			}
			break;
		}

		else if(x==2)
		{
			System.out.print("Please Enter the Account Holder's Name:");
			String name =scan.next();
			System.out.print("Please Enter the Account Number:");
			String acc =scan.next();
			System.out.print("Please Enter the IFSC Code:");
			String code =scan.next(); 
			
			amount = amount- send;
			System.out.printf("Rs.%f is send to  %s. \nAccount Number : %s\nIFSC Code: %s \n",send,name,acc,code);
			System.out.println("Current Available Balance is Rs."+ amount+"\n");
			System.out.println("-----------------------------------------------------------------------");
			
			break;
		}
		else 
		{
			System.out.println("Invalid input Please try again");
			System.out.println("-----------------------------------------------------------------------");
			
		}
		
		}
		else 
		{ 
			System.out.println("Low Balance");
		}
		}
			
		}
		catch(Exception e) {
			
		}
		return amount;
	}

}
