package com.gfg.LibraryMgmtSystem.Models;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
//@Builder
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	public Transaction(String transactionId, Integer fine, Student student, Book book,
			TransactionStatus transactionStatus, TransactionType transactionType) {
		super();
		this.transactionId = transactionId;
		this.fine = fine;
		this.student = student;
		this.book = book;
		this.transactionStatus = transactionStatus;
		this.transactionType = transactionType;
	}

	public Transaction() {
		super();
	}

	public Transaction(String transactionId, Student student, Book book, TransactionStatus transactionStatus,
			TransactionType transactionType) {
		super();
		this.transactionId = transactionId;
		this.student = student;
		this.book = book;
		this.transactionStatus = transactionStatus;
		this.transactionType = transactionType;
	}

	private String transactionId;// added manually 
	
	private Integer fine;
	
	@ManyToOne 
	@JoinColumn  //tip to remember : find the student details when transaction is given
	@JsonIgnoreProperties(value = "transactionList")
	private Student student;
	
	@ManyToOne
	@JoinColumn    //we will be referencing bookId as foreign key here from book table
	@JsonIgnoreProperties(value = "transactionList")
	private Book book; //doubt : what if a table have more than primary key.
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getFine() {
		return fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
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

	@Enumerated(value=EnumType.STRING)
	private TransactionStatus transactionStatus;
	
	@Enumerated(value=EnumType.STRING)
	private TransactionType transactionType;
	
	@CreationTimestamp    
	private Date createdOn; 
	
	@UpdateTimestamp
	private Date updatedOn;
	
}
