package com.gfg.LibraryMgmtSystem.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfg.LibraryMgmtSystem.Models.Student;
import com.gfg.LibraryMgmtSystem.Repos.StudentRepo;

import lombok.Builder;
import lombok.Setter;

@Service
//@Builder
@Setter
public class StudentService {		

	@Autowired
	StudentRepo studentRepo;//Injecting Interface
	
//When you have multiple implementations of an interface, Spring Boot can 
//automatically inject the appropriate implementation based on the context and configuration.
	
	public void createStudent(Student student) {
		System.out.println("Inside Create Student");
		System.out.println(student.getEmail());
		studentRepo.save(student);  //this method will save the student details in student table
		//as a Record.
	}

	public Student getStudentById(int studentId) {
		// TODO Auto-generated method stub
		return studentRepo.findById(studentId).orElse(null);  //this method will enable us to 
		//find the student details by passing the Id.
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	} 		
}
