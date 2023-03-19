package Bank_App;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import operations.*;


public class Main {
	public static void main(String[] args) throws Exception {
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("                                               WELCOME TO  XYZ BANK APPLICATION                                                               ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		isValid_User v= new isValid_User();
		v.verifyUser();
		double amount= (double) showBalance.amount;
		
		if(isValid_User.flag==true)
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) 
		{
			
			 System.out.println("Choose 1: for BANK BALANCE CHECK");
		     System.out.println("Choose 2: for DEPOSIT MONEY IN YOUR ACCOUNT ");
		     System.out.println("Choose 3: for WITHDRAW MONEY ");
		     System.out.println("Choose 4: for TRANSFER MONEY ");
		     System.out.println("Choose 5: for EXIT");
		     System.out.println("Choose the one option on the based of your choice of operation :: ");
		     System.out.println("------------------------------------------------------------------------");
		     
		     String option = br.readLine();
		     
		     
		switch(option)
		{
		
		
		 case "1":
			 amount = showBalance.Check(amount);
             System.out.println();
             break;
         case "2":
        	 amount = deposit.DepositMoney(amount);
             System.out.println();
             break;
         case "3":
        	 amount = withdrawOper.withdraw (amount);
             System.out.println();
             break;
         case "4":
        	 amount = tranferMoney.Send(amount);
             System.out.println();
             break;
         case "5":
         	System.out.println("************* Thanks for using our  application *************");
             System.exit(0);
             
         default:
             System.out.println("Invalid input, Please enter a number from 1 to 5.");
             System.out.println();
             break;
		}
		

		}
	}
		else
		{
			System.out.println("********** Your Id and Password is not match, Kindly enter the correct input *********");
			
		}
	}

	
		
	
  }





	


