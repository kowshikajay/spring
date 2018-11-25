package com.cg.sessionmanagement.dao;

import java.util.List;

import com.cg.sessionmanagement.dto.Student;

public interface IStudentDAO {

	int addStudent(Student student);

	Student searchStudent(int studentId);

	int updateStudent(Student student);

	//List<Student> searchStudent(int id);
	
}
