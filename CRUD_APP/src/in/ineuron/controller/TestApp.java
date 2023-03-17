package in.ineuron.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.*;

import in.ineuron.dto.Student;
import in.ineuron.servicefactory.StudentServiceFactory;
import in.ineuron.services.IStudentService;

public class TestApp {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //	Scanner scanner = new Scanner(System.in);
    	while (true) {
    		
    	System.out.println("******** WELCOME TO MY CRUD APP ********");
        System.out.println("Choose 1 for INSERT DATA");
        System.out.println("Choose 2 for DISPLAY DATA BY SELECTING ");
        System.out.println("Choose 3 for UPDATE ADDRESS BASED ON PATICULAR ID OF STUDENT");
        System.out.println("Choose 4 for DELETE DATA BASED ON PATICULAR ID OF STUDENT");
        System.out.println("Choose 5 for EXIT");
        System.out.print("Choose the operation you want to perform:: ");
        String option = br.readLine();
        
        
      
            

           // int n = scanner.nextInt();
            switch (option) {
                case "1":
                    insertOperation();
                    System.out.println();
                    break;
                case "2":
                    selectOperation();
                    System.out.println();
                    break;
                case "3":
                    updateOperation();
                    System.out.println();
                    break;
                case "4":
                    deleteOperation();
                    System.out.println();
                    break;
                case "5":
                	System.out.println("******* Thanks for using the application *****");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid input. Please enter a number from 1 to 5.");
                    System.out.println();
                    break;
                    
                   
                    
            }
        }
    	
    }

  


	//////////////////////////////////////////////////////////////////////////////////////////////
	private static void updateOperation() {
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		
		
		
		System.out.println("enter the student id to be updated  :: ");
		int  sid = scanner.nextInt();
		
		System.out.println("enter the student address which to be updated  :: ");
		String saddress = scanner.next();
		
		IStudentService studentService= StudentServiceFactory.getStudentService();
		String  msg= studentService.updateStudent(sid,saddress);
		
		if(msg.equalsIgnoreCase("success")) {
			System.out.println("record update successfully");
		}else if(msg.equalsIgnoreCase("not found")) {
			System.out.println("record not available for the givem id :: "+ sid);
		}
		else {
			System.out.println("record update  failed ");
		}
	
		
		
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////
	
	private static void deleteOperation() {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter the student id to be deleted  :: ");
		int  sid = scanner.nextInt();
		
		IStudentService studentService= StudentServiceFactory.getStudentService();
		String  msg= studentService.deleteStudent(sid);
		
		if(msg.equalsIgnoreCase("success")) {
			System.out.println("record deleted successfully");
		}else if(msg.equalsIgnoreCase("not found")) {
			System.out.println("record not available for the givem id :: "+ sid);
		}
		else {
			System.out.println("record deletion  failed ");
		}
		
		
	}
		///////////////////////////////////////////////////////////////////////////////////////////////
		//insertOperation();
		private static void selectOperation() {
			
	
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter the student id :: ");
		int  sid = scanner.nextInt();
		
		IStudentService studentService= StudentServiceFactory.getStudentService();
		Student std= studentService.searchStudent(sid);
		
		if(std!=null) {
			System.out.println(std);
			System.out.println("SID\tSNAME\tSAGE\tADDRESS");
			System.out.println(std.getSid()+"\t"+std.getSname()+"\t"+std.getSage()+"\t"+std.getSaddress());
		}
		else {
			System.out.println("record not found for the given id:: "+ sid );
		}
		
		
		
	}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		private static void insertOperation() 
		{
		
		//Connection connection= DriverManager.GetConnection(url,username,password);
		IStudentService studentService= StudentServiceFactory.getStudentService();
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the student name :: ");
		String sname= scanner.next();
		
		System.out.println("enter the student age :: ");
		int  sage= scanner.nextInt();
		
		System.out.println("enter the student address :: ");
		String saddress = scanner.next();
		
		
		
		String msg= studentService.addStudent(sname,sage,saddress);
		
		if(msg.equalsIgnoreCase("success")) {
			System.out.println("record inserted successfully");
		}
		else {
			System.out.println("record inseration failed ");
		}
		
	
	}

	
	////////////////////////////////////////////////////////////////////////////////////

}
