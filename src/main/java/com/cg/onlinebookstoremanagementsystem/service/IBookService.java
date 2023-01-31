package com.cg.onlinebookstoremanagementsystem.service;

import java.util.Date;
import java.util.List;

import com.cg.onlinebookstoremanagementsystem.entity.Book;
import com.cg.onlinebookstoremanagementsystem.exception.ResourceNotFoundException;

public interface IBookService {
	
		public Book addBook(Book book);
		public List<Book> listAllBooks();
		public Book getBookById(Long bookId)  throws ResourceNotFoundException;
		public Book updateBook(Book book,Long bookId) throws ResourceNotFoundException;
		public void deleteBook(Long bookId);
		public Book findByBookName(String bookName) ;
		public List<Book> findByBookCategory(String bookCategory);
		public List<Book> findByBookPriceLessThan(float bookPrice);
		public List<Book> findByBookPriceGreaterThan(float bookPrice);
		public List<Book> findByBookAuthorName(String authorName);
		public List<Book> findByBookDescription(String description);
		public List<Book> findByBookPublishingYear(Date publishingYear);
		
		
		
	}

