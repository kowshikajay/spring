package com.cg.sessionmanagement.servcie;

import java.util.List;

import com.cg.sessionmanagement.dto.Student;

public interface IStudentService {

	int addStudent(Student student);

	Student searchStudent(int studentId);

	int updateStudent(Student student);

	

}
