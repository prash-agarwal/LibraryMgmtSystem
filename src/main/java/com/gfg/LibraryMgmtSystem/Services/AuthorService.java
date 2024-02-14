package com.gfg.LibraryMgmtSystem.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfg.LibraryMgmtSystem.Models.Author;
import com.gfg.LibraryMgmtSystem.Models.Book;
import com.gfg.LibraryMgmtSystem.Repos.AuthorRepo;

@Service
public class AuthorService {

	@Autowired
	AuthorRepo authorRepos;
	
	public Author createOrGetAuthor(Book book) {
		
		//Here we are checking that whether the Author object that is passed alongwith
		//book object exists in the author table. If it exists then we will return that object only
		//otherwise we will create new record for author details in author table.
		
		Author authorFromDB=authorRepos.findAuthor(book.getAuthor().getEmail());
		
		if(authorFromDB==null) {
			authorFromDB = authorRepos.save(book.getAuthor());
		}
		return authorFromDB;
	}
}