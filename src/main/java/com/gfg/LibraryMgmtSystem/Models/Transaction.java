package com.gfg.LibraryMgmtSystem.Models;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	
	private int fine;
	
	@ManyToOne 
	private Student student;
	
	@ManyToOne
	private Book book;
	
	private TransactionStatus transactionStatus;
	
	private TransactionType transactionType;
	

	@CreationTimestamp    
	private Date createdOn; 
	
	@UpdateTimestamp
	private Date updatedOn;


	
}
