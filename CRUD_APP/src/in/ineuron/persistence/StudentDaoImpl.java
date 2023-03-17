package in.ineuron.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.dto.Student;
import ineuron.jdbcutil;


public class StudentDaoImpl implements IStudentDao{
	
	Connection connection= null;
	PreparedStatement psmt= null;
	ResultSet resultSet= null;
	
	

	@Override
	public String addStudent(String sname, Integer sage,String saddress) {
		String sqlInsertQuery=" insert into student(`name`,`age`,`address`) values (?,?,?)";
		try {
			connection=jdbcutil.getJdbcConnection();
			
			if(connection!=null) 
				
				psmt= connection.prepareStatement(sqlInsertQuery);
			
			if(psmt!=null) {
				psmt.setString(1, sname);
				psmt.setInt(2, sage);
				psmt.setString(3,saddress);
				
				int rowaffect= psmt.executeUpdate();
				
				if(rowaffect==1) {
					return "success";
				}
			}
			
		} 
		
		
		catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "failure";
	}
	
	@Override
	public Student searchStudent(Integer sid) {
		
		String sqlSelectQuery=" select id,name,age,address from  student where id=?";
		Student student= null;
		try {
			connection=jdbcutil.getJdbcConnection();
			
			if(connection!=null) 
				
				psmt= connection.prepareStatement(sqlSelectQuery);
			
			if(psmt!=null) 
				
				psmt.setInt(1, sid);
				
			if(psmt!=null) {
				
				resultSet= psmt.executeQuery();
			}
				
			if(resultSet!=null) {
			
				
				if(resultSet.next()) {
					student= new Student();
					
					//copy result set data to student object
					student.setSid(resultSet.getInt(1));
					student.setSname(resultSet.getString(2));
					student.setSage(resultSet.getInt(3));
					student.setSaddress(resultSet.getString(4));
					
					return student;
				}
			}
			
			
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		return student;
	}


	@Override
	public String updateStudent(Integer sid, String saddress) {
		String sqlDeleteQuery="update student set address=? where id=?";
		try {
			connection=jdbcutil.getJdbcConnection();
			
			if(connection!=null) 
				
				psmt= connection.prepareStatement(sqlDeleteQuery);
			
			if(psmt!=null) {
				psmt.setString(1, saddress);
				psmt.setInt(2, sid);
				
				int rowaffect= psmt.executeUpdate();
				
				if(rowaffect==1) {
					return "success";
				}else {
					return "not found";
				}
			}
			
		} 
		
		
		catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "failure";
	}
	
	@Override
	public String deleteStudent(Integer sid) {
		
		String sqlDeleteQuery=" delete from student where id= ?";
		try {
			connection=jdbcutil.getJdbcConnection();
			
			if(connection!=null) 
				
				psmt= connection.prepareStatement(sqlDeleteQuery);
			
			if(psmt!=null) {
		
				psmt.setInt(1, sid);
				
				
				int rowaffect= psmt.executeUpdate();
				
				if(rowaffect==1) {
					return "success";
				}else {
					return "not found";
				}
			}
			
		} 
		
		
		catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failure";
		}
		
		return "failure";
		
		}
	

}
