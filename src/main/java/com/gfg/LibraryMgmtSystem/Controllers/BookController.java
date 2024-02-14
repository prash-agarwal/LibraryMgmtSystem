package com.gfg.LibraryMgmtSystem.Controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gfg.LibraryMgmtSystem.Models.Book;
import com.gfg.LibraryMgmtSystem.Services.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	Logger logger=LoggerFactory.getLogger(BookController.class);

	@PostMapping("/createBook")
	public void createBook(@RequestBody Book book) {
	
		bookService.createBook(book);
	}
	@GetMapping("/book/all")
    public List<Book> getBooks(){
		System.out.println("Inside getBooks");
		logger.info("Inside getBooks");
        return bookService.getBooks();
    }

    @GetMapping("/book/{bookId}")
    public Book getBookById(@PathVariable("bookId") int bookId){
        return bookService.getBookById(bookId);
    }
}