package com.cg.sessionmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.objenesis.strategy.StdInstantiatorStrategy;
import org.springframework.stereotype.Repository;

import com.cg.sessionmanagement.dto.Student;


@Repository("studentdao")
public class StudentDAOImpl implements IStudentDAO {

	 @PersistenceContext
	    EntityManager entityManager;
	
	
	@Override
	public int addStudent(Student student) {
		entityManager.persist(student);
		 entityManager.flush();
		
		return student.getStudentId();
	}


	@Override
	public Student searchStudent(int studentId) {
		
		Student student;
		student=entityManager.find(Student.class, studentId);
		
		return student;
		
	}


	@Override
	public int updateStudent(Student student) {
		entityManager.merge(student);
		entityManager.flush();
		return student.getStudentId();
	}


	/*@Override
	public List<Student> searchStudent(int id) {
		//Student student=null;
		//Student s1=entityManager.find(Student.class, student.getStudentId());
		   Query queryOne = entityManager.createQuery("FROM Studentvenky");
		//if(s1!=null){
		//	return (List<Student>) s1;
		//}
		   List<Student> myList = queryOne.getResultList();
		   if(myList!=null){
			   
			   return myList; 
		   }
		
		return myList;
	}*/

	
	
	
}
