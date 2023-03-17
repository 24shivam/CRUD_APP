package in.ineuron.servicefactory;

import in.ineuron.services.IStudentService;
import in.ineuron.services.StudentServiceImpl;


// abstraction logic  of implementation
public class StudentServiceFactory {
	

//MAKE CONSTRUCT PRIVATE TO AVOID OBJECT CREATION
	private StudentServiceFactory() {
		
	}
	
	public static IStudentService  studentService= null;
	
	
	public static IStudentService  getStudentService() {
		//singleton pattern code 
		
		if(studentService==null) {
			
			studentService = new StudentServiceImpl();
		}
	
		return studentService;
		
	}
	
	
	
	
	
	
	
	
	
}
