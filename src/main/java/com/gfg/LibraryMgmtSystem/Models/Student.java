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
import lombok.Builder;
import lombok.Setter;

@Entity
@Builder
@Setter
public class Student {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int studentid;
	
	private String name;
	private int age;
	
	@Column(unique=true,nullable=false)  //ensures that value of email will be unique and 
	//it is not nullable
	private String email;
	
	@OneToMany(mappedBy="student") //passing the student object from Student class as reference
	private List<Book> bookList;
	
	@OneToMany(mappedBy="student")
	private List<Transaction> transaction;
	
	@CreationTimestamp    
	private Date createdOn; 
	
	@UpdateTimestamp
	private Date updatedOn;
	
}
