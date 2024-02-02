package com.gfg.LibraryMgmtSystem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfg.LibraryMgmtSystem.Models.Student;
import com.gfg.LibraryMgmtSystem.Repos.StudentRepo;

import lombok.Builder;
import lombok.Setter;

@Service
@Builder
@Setter
public class StudentService {

	@Autowired
	StudentRepo studentRepo;//Injecting Interface
	
//When you have multiple implementations of an interface, Spring Boot can 
//automatically inject the appropriate implementation based on the context and configuration.
	
//we cannot create an object of an interface in Java using the new keyword because an 
//interface is a purely abstract type and does not have a concrete implementation. 
//Interfaces define a contract that classes implementing the interface must fulfill, 
//but an interface itself cannot be instantiated.
//However, you can create a reference variable of the interface type and assign it
//to an object of a class that implements the interface. Here's an example:
	
	public void createStudent(Student student) {
		studentRepo.save(student);  //this method will save the student details in student table
		//as a Record.
	}

	public Student getStudentById(int studentId) {
		// TODO Auto-generated method stub
		return studentRepo.findById(studentId).orElse(null);  //this method will enable us to 
		//find the student details by passing the Id.
	} 
}
