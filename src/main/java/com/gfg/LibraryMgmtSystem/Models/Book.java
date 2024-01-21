package com.gfg.LibraryMgmtSystem.Models;
import java.util.Date;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {
	
	
	//Unidirectional - Having only the foreign key attribute in the current class.
	//Bidirectional - Having foreign key attribute in the current class as well as the 
	//back-reference in the other class.
	//Assumption - One Book will have only one Author.
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //In AUTO option Hibernate will take care of it. 
	private int id;   //Int
	private String name; //VARCHAR
//	private int count;
	
	//when book table will load, it will also load the details of author object.
	@ManyToOne     //Left part of annotation is the CurrentClass and Right Part is Object. 
	@JoinColumn    //this will allow to take id(Primary Key in Author) as column from class 
	//Author as foreign key in Book Table.
	private Author author;
	
	//@Enumerated(value=EnumType.ORDINAL)  //Value will be stored as Number,
	@Enumerated(value=EnumType.STRING)  //if we select STRING, value will be stored as string 
	private Genre genre;
	
	@ManyToOne 
	@JoinColumn     //referring to studentId as Foreign Key in Student Class
	private Student student;
	
	//oneToone
	//oneTomany
	//manyToone
	//manyTomany
	
	@OneToMany(mappedBy="book")  //using BackReferencing as we wont be referrinig foreign key here
	private List<Transaction> transaction;//when we are having (Many) at Right, then we will use List 
	
	//As one Book can have many transactions so creating List of transaction.
	
	@CreationTimestamp     //This will create a timestamp when a record gets created.
	private Date createdOn;  
	
	@UpdateTimestamp		//This will create a timestamp when a record gets updated.	
	private Date updatedOn;
	

//	if we are having 2 sql tables namely book and author, 
//	then which table should have the foreign key referencing to other table and why??
	
//A single author can write many books (one-to-many relationship).
//Therefore, the Book table has a relationship with multiple rows in the Author table.
//	Placing the foreign key in the Book table allows you to easily identify all books 
//	written by a specific author by querying the Book table based on the foreign key value.
//	Conversely, if the Author table held the foreign key, you would need to perform a 
//	join operation and potentially multiple queries to find all books by a specific author.	
//	
}
