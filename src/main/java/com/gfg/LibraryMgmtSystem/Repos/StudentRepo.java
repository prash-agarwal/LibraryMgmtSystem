package com.gfg.LibraryMgmtSystem.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.gfg.LibraryMgmtSystem.Models.Student;
import jakarta.persistence.EntityManager;

//using JPA interface
//@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
}

//public interface StudentRepo extends JpaRepository<T, ID>{	
//}  
//here T represents the entity type and ID represents the type of the entity's primary key


//if we inherit the implementation of JPA directly that is SimpleJpaRepository class,
//then also it works fine.

//public abstract class StudentRepo extends SimpleJpaRepository<Student, Integer>{
//
//	public StudentRepo(Class<Student> domainClass, EntityManager entityManager) {
//		super(domainClass, entityManager);
//		// TODO Auto-generated constructor stub
//	}
