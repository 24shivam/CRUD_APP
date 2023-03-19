package operations;

import java.util.Scanner;

public class isValid_User {

	static Scanner scan= new Scanner (System.in);
	
	public final static String UserId="admin3239";
	public final static  String UserPassword = "known8989";
	public static boolean flag=false ;

	public   void  verifyUser() 
	{
		try {
		System.out.println("Please enter your customer User_Id :: ");
		String uid= scan.next();
		System.out.println("Please enter your customer User_Password :: ");
		String upass= scan.next();
		
		if(UserId.equals(uid) && UserPassword.equals(upass)) 
		{
			System.out.println("!!!!! THANKS FOR YOUR VERIFICATION !!!!!");
			System.out.println("-------------------------------------------------------------------");
			flag=true;
		}
		}catch(Exception e) {
			System.out.println("Invalid Format ");
			System.out.println("-------------------------------------------------------------------------");
		}

	}
}
