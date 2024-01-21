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
import lombok.Builder;

@Entity
@Builder
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	private int fine;
	
	@ManyToOne 
	@JoinColumn  //tip to remember : find the student details when transaction is given
	private Student student;
	
	@ManyToOne
	@JoinColumn    //we will be referencing bookId as foreign key here from book table
	private Book book;
	
	@Enumerated(value=EnumType.STRING)
	private TransactionStatus transactionStatus;
	
	@Enumerated(value=EnumType.STRING)
	private TransactionType transactionType;
	
	@CreationTimestamp    
	private Date createdOn; 
	
	@UpdateTimestamp
	private Date updatedOn;
	
}
