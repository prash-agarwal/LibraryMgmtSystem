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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //In AUTO option Hibernate will take care of it. 
	private int id;
	private String name;
	private int count;
	@ManyToOne           //Left part of annotation is the CurrentClass and Right Part is Object. 
	private Author author;
	
	//@Enumerated(value=EnumType.ORDINAL)  //Value will be stored as Number,
	@Enumerated(value=EnumType.STRING)  //if we select STRING, value will be stored as string 
	private Genre genre;
	
	@ManyToOne 
	private Student student;
	
	//oneToone
	//oneTomany
	//manyToone
	//manyTomany
	
	@OneToMany
	private List<Transaction> transaction;//when we are having (Many) at Right, then we will use List 
	
	//As one Book can have many transactions so creating List of Books.
	
	@CreationTimestamp     //This will create a timestamp when a record gets created.
	private Date createdOn; //This will create a timestamp when a record gets updated. 
	
	@UpdateTimestamp
	private Date updatedOn;
	
}
