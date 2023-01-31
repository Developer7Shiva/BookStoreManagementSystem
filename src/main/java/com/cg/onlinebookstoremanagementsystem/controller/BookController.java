package com.cg.onlinebookstoremanagementsystem.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinebookstoremanagementsystem.entity.Book;
import com.cg.onlinebookstoremanagementsystem.exception.ResourceNotFoundException;
import com.cg.onlinebookstoremanagementsystem.service.IBookService;

@RestController
@RequestMapping("/books")
public class BookController {
	//autowiring the service layer in to the controller layer
		@Autowired
		private IBookService bookService;
		
		@PostMapping("/addbook")
		public Book addBook(@RequestBody Book book) {
			return bookService.addBook(book);
		}
		
		@GetMapping("/getbook")
		public List<Book> listAllBooks(){
			return bookService.listAllBooks();
		}
		
		@GetMapping("/getbook/{bookid}")
		public Book getBookById(@PathVariable("bookid") Long bookId)  throws ResourceNotFoundException{
			return bookService.getBookById(bookId);
		}
		
		@PutMapping("/updatebook/{bookid}")
		public Book updateBook(@RequestBody Book book,@PathVariable("bookid") Long bookId) throws ResourceNotFoundException{
			return bookService.updateBook(book, bookId);
		}
		
		@DeleteMapping("/deletebook/{bookid}")
		public void deleteBook(@PathVariable("bookid") Long bookId) {
			bookService.deleteBook(bookId);
		}
		
		@GetMapping("/findbookbyname/{bookname}")
		public Book findByBookName(@PathVariable("bookname") String bookName) {
			return bookService.findByBookName(bookName);
		}
		
		@GetMapping("/findbookbycategory/{bookct")
		public List<Book> findByBookCategory(@PathVariable("bookct") String bookCategory) {
			return bookService.findByBookCategory(bookCategory);
		}
		
		@GetMapping("/findbookbyprice/{bookpr}")
		public List<Book> findByBookPriceLessThan(@PathVariable("bookpr") float bookPrice){
			return bookService.findByBookPriceLessThan(bookPrice);
		}
		
		@GetMapping("/findbookbyprice/{bookpr}")
		public List<Book> findByBookPriceGreaterThan(@PathVariable("bookpr")  float bookPrice){
			return bookService.findByBookPriceGreaterThan(bookPrice);	
		}
		@GetMapping("/findbookbyauthor/{bookau}")
		public List<Book> findByBookAuthorName(@PathVariable("bookau")  String authorName){
			return bookService.findByBookAuthorName(authorName);		
		}
		@GetMapping("/findbookbydescription/{bookdes}")
		public List<Book> findByBookDescription(@PathVariable("bookdes")  String description){
			return bookService.findByBookDescription(description);	
		}
		@GetMapping("/findbookbypublishingyear/{bookyr}")
		public List<Book> findByBookPublishingYear(@PathVariable("bookyr")  Date publishingYear ){
			return bookService.findByBookPublishingYear(publishingYear);	
		}
	

}