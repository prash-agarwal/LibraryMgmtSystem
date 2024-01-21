package com.gfg.LibraryMgmtSystem.Repos;

import org.springframework.stereotype.Repository;

import com.gfg.LibraryMgmtSystem.Models.Book;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer>{

	
	
	
}
