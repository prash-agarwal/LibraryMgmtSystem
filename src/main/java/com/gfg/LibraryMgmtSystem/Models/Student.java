package com.gfg.LibraryMgmtSystem.Models;
import java.util.Date;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Setter;

@Entity
//@Builder
@Setter
public class Student {

	//In this class when I declared all the below fields as private without creating getters
	//and setters, on calling createStudent() method, data through postman api request 
	//was'nt getting inserted.
	//after creating getters and setters, the data got inserted successfully.
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int studentid;
	
	private String name;
	private int age;
	
	//@Column(unique=true,nullable=false)  //ensures that value of email will be unique and 
	//it is not nullable
	private String email;
	
	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@OneToMany(mappedBy="student") //passing the student object from Student class as reference
//	@JsonIgnoreProperties(value = "student")
	private List<Book> bookList;
	
	@OneToMany(mappedBy="student")
	//@JsonIgnoreProperties(value = "student")
	private List<Transaction> transaction;
	
	@CreationTimestamp    
	private Date createdOn; 
	
	@UpdateTimestamp
	private Date updatedOn;
}
