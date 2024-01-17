package com.gfg.LibraryMgmtSystem.Models;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //In AUTO option Hibernate will take care of it. 
	private int id;
	
	@Column(name="myAuthName")
	private String authName;
	
	@Column(unique=true,nullable=false)  //ensures that value of email will be unique and 
	//it is not nullable
	private String email;
	
	@OneToMany
	private List<Book> bookList; //when we are having (Many) at Right, then we will use List 
	//As one Author can have many books so creating List of Books.
	
	
	
	@CreationTimestamp    
	private Date createdOn; 
	
	@UpdateTimestamp
	private Date updatedOn;
	
	
	
	
}
