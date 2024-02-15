package com.gfg.LibraryMgmtSystem.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gfg.LibraryMgmtSystem.Models.Book;
import com.gfg.LibraryMgmtSystem.Models.Student;
import com.gfg.LibraryMgmtSystem.Models.Transaction;
import com.gfg.LibraryMgmtSystem.Models.TransactionType;


public interface TransactionRepo extends JpaRepository<Transaction, Integer>{

	//Transaction findByTransactionId(int id);
	
	//List<Transaction>  findByStudent(Student student);
		
	//	List<Transaction> findByStudentAndBook(Student student, Book book);
		
	//	List<Transaction>  findByStudentOrderById(Student student);// order by on trasnction id primary key
	
	//Q. find the latest  transaction with student book and  trasnaction status should be TRANSCTION TYPE ISSUE
	
	List<Transaction> findByStudentAndBookAndTransactionTypeOrderByIdDesc(Student student, Book book, TransactionType transactionType);
}
