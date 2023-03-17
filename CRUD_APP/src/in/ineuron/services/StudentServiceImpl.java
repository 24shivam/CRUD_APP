package in.ineuron.services;

import in.ineuron.daofactory.StudentDaoFactory;
import in.ineuron.dto.Student;
import in.ineuron.persistence.IStudentDao;
import in.ineuron.servicefactory.StudentServiceFactory;



public class StudentServiceImpl implements IStudentService {

	
	private IStudentDao  stdDao;
	@Override
	public String addStudent (String sname, Integer sage, String saddress) {
		
		stdDao= StudentDaoFactory.getStudentDao();	
		return  stdDao.addStudent(sname, sage, saddress);
		
	}

	@Override
	public Student searchStudent (Integer sid) {
		stdDao= StudentDaoFactory.getStudentDao();	
		return  stdDao.searchStudent(sid);
	
	}

	@Override
	public String updateStudent(Integer sid, String saddress) {
		
		stdDao= StudentDaoFactory.getStudentDao();
		return stdDao.updateStudent(sid, saddress);
	}

	@Override
	public String deleteStudent(Integer sid) {
		stdDao= StudentDaoFactory.getStudentDao();
		
		return stdDao.deleteStudent(sid);
	}

}
