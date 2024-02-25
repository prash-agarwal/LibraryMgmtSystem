package com.gfg.LibraryMgmtSystem.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gfg.LibraryMgmtSystem.Models.Author;

public interface AuthorRepo extends JpaRepository<Author,Integer> {
	
	//SimpleJpaRepository is the class which provides implementation of JpaRepository.
	
	/** Custom queries
     * 1. JPQL - Java persistence query language (format which executes query considering java classes / objects)
     * always uses reference to access the value in object.
     * 2. Custom SQL queries or NATIVE query - Format which executes query considering your 
     * sql tables / relations
     */
	
	//JPQL 
//	@Query(value="select b from author b where b.email=:email") //here b is used to specify the
//	//object as JPQL works on object rather than whole table.
//	Author findAuthor(String email);
	
	@Query(value = "select a from Author a where a.email = :email")//here instead of the name of table in sql, java class is passed as 'Author'
    Author findAuthor(String email); //if we pass it as table name as 'author', then it will give error.
	
	//@Query(value="select * from Author where email=:email")//way that we use in sql
	//but if we use this, it will give error.
	
	//@Query(value="select a from Author a where a.email=:email")
	//we can use any refernce variable.
	
//	@Query(value="select b from Author b where b.email=?1 and b.auth_name=?2") 
//	Author findAuthorByEmailAndName(String email, String authName);
	//OR
//	@Query(value="select b from Author b where b.email=?2 and b.auth_name=?1") 
//	Author findAuthorByEmailAndName(String authName, String email);
	//the above query is not working. Kindly Crosscheck.
	//Native Query
//	@Query(value="select * from author where email=:email", nativeQuery=true) 
//	Author findAuthorByEmail2(String email);
}
