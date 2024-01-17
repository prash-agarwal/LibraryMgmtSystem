package com.gfg.LibraryMgmtSystem.Models;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int studentid;
	
	private String name;
	private int age;
	
	
	@OneToMany
	private List<Book> bookList;
	
	@OneToMany
	private List<Transaction> transaction;
	
	@CreationTimestamp    
	private Date createdOn; 
	
	@UpdateTimestamp
	private Date updatedOn;


}
