package com.gfg.LibraryMgmtSystem.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gfg.LibraryMgmtSystem.Models.Author;
import com.gfg.LibraryMgmtSystem.Models.Book;
import com.gfg.LibraryMgmtSystem.Repos.BookRepo;


@Service
public class BookService {

	@Autowired
	BookRepo bookrepo;
	
	@Autowired					
	AuthorService authService;//According to solid principles service class should only interact
	//with service class other than it's own repo class, that's why defined bean of AuthorService
	//here.
	
	public void createBook(Book book) {
		
		Author author =authService.createOrGetAuthor(book.getMyAuthor());
		
		bookrepo.save(book);
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
