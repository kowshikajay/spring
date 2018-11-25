package com.cg.sessionmanagement.servcie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.sessionmanagement.dao.IStudentDAO;
import com.cg.sessionmanagement.dao.StudentDAOImpl;
import com.cg.sessionmanagement.dto.Student;


@Service("employeeservice")
@Transactional
public class StudentServiceImpl implements IStudentService {
	@Autowired
	IStudentDAO dao;
	

	@Override
	public int addStudent(Student student) {
		
		return dao.addStudent(student);
	}


	@Override
	public Student searchStudent(int studentId) {
		// TODO Auto-generated method stub
		return dao.searchStudent(studentId);
	}


	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.updateStudent(student);
	}


	/*@Override
	public List<Student> searchStudent(int id) {
		// TODO Auto-generated method stub
		return dao.searchStudent(id);
	}
*/
	
}
