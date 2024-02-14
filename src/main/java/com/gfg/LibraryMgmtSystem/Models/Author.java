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

@Entity
public class Author {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
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

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //In AUTO option Hibernate will take care of it. 
	private int id;
	
	@Column(name="myAuthName",length =15)   //varchar(15)
	private String authName;
	
	@Column(unique=true,nullable=false)  //ensures that value of email will be unique and 
	//it is not nullable
	private String email;  //check this plz
	
	@OneToMany(mappedBy="author")//passing the object of Author from Book Class.
	//It is for Backreferencing
	
	//if we don't use this JsonIgnore below, then on calling method getBooks of BookController
	//class, we won't get proper response.
	//Ryt now it is for book class only which is referring object of 'author' with @ManyToOne
	//Relationship.
	@JsonIgnoreProperties(value = {"author", "createdOn", "updatedOn"})
	private List<Book> bookList; //Here booklist won't be present as column in Author Table.
	//when we are having (Many) at Right, then we will use List 
	//As one Author can have many books so creating List of Books.
	
	@CreationTimestamp    
	private Date createdOn; 
	
	@UpdateTimestamp
	private Date updatedOn;
}