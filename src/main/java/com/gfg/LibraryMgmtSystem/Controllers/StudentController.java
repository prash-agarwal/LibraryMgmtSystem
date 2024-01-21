package com.gfg.LibraryMgmtSystem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfg.LibraryMgmtSystem.CreateRequest.StudentCreateRequest;
import com.gfg.LibraryMgmtSystem.Models.Student;
import com.gfg.LibraryMgmtSystem.Services.StudentService;

import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Setter;

@RestController
@RequestMapping("/student")
@Builder
@Setter
public class StudentController {

	@Autowired
	StudentService sr; 
	
	@PostMapping("/createStudent")
	public void createStudent(@Valid @RequestBody Student student) {
		sr.createStudent(student);
	} //some more validation Annotations : @Positive , @NotBlank
	
//	@PostMapping("/createStudent")
//	public void createStudent(@Valid @RequestBody StudentCreateRequest studentCreateRequest) {
//		sr.createStudent(studentCreateRequest.to());
//	} 
	
	@PostMapping("/{studentId}")
	public Student getStudent(@PathVariable("studentId") int studentId) {
		return sr.getStudentById(studentId);
	} 
}
