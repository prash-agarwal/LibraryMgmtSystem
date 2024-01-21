package com.gfg.LibraryMgmtSystem.CreateRequest;

import com.gfg.LibraryMgmtSystem.Models.Student;

import lombok.Builder;
@Builder
public class StudentCreateRequest {

	int age;
	
	int name;
	int email;
	
//	public Student to() {
//		return Student.builder().age(age).name(name).email(email).build();		
//	}
	
}
