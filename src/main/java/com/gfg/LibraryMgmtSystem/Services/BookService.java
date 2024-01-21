package com.gfg.LibraryMgmtSystem.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gfg.LibraryMgmtSystem.Models.Book;
import com.gfg.LibraryMgmtSystem.Repos.BookRepo;

@Service
public class BookService {

	BookRepo bookrepo;
	
	public void createBook(Book book) {
		
		
	}

	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}
}
