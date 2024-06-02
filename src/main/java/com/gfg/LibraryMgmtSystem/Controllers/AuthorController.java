package com.gfg.LibraryMgmtSystem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import com.gfg.LibraryMgmtSystem.Services.AuthorService;
import com.example.EmployeeMgmtSystem.*;
import com.example.EmployeeMgmtSystem.Models.Employee;
import com.example.EmployeeMgmtSystem.Services.EmployeeServices;

@RestController
public class AuthorController {

	@Autowired
	AuthorService authorService;
	
	
	//using EmployeeServices from another project EmployeeMgmtSystem dependency
	//added in this project.
	@Autowired
	EmployeeServices employeeServices;
	
	public void checking() {
	employeeServices.createEmployee(new Employee());
	}
	
}
