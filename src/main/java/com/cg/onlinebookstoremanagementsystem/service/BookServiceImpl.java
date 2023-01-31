package com.cg.onlinebookstoremanagementsystem.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.onlinebookstoremanagementsystem.entity.Book;
import com.cg.onlinebookstoremanagementsystem.exception.ResourceNotFoundException;
import com.cg.onlinebookstoremanagementsystem.repository.BookRepository;



    public class BookServiceImpl implements IBookService {
	@Autowired
	private BookRepository bookRepo;

	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
		}

	@Override
	public List<Book> listAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public Book getBookById(Long bookId) throws ResourceNotFoundException {
		return bookRepo.findById(bookId)
				.orElseThrow(() -> new ResourceNotFoundException("Book Not found"));
	}

	@Override
	public Book updateBook(Book book, Long bookId) throws ResourceNotFoundException {
		Book existingBook = bookRepo.findById(bookId)
													.orElseThrow(() -> new ResourceNotFoundException("Book Not found"));
		existingBook.setBookName(book.getBookName());
		existingBook.setBookPrice(book.getBookPrice());
		existingBook.setBookCategory(book.getBookCategory());
		existingBook.setAuthorName(book.getAuthorName());
		existingBook.setDescription(book.getDescription());
		existingBook.setPublishingYear(book.getPublishingYear());
		
		bookRepo.save(existingBook);
		return existingBook;
	}

	@Override
	public void deleteBook(Long bookId)  {
		bookRepo.deleteById(bookId);		
	}

	@Override
	public Book findByBookName(String bookName) {
		return bookRepo.findByBookName(bookName);
	}

	@Override
	public List<Book> findByBookCategory(String bookCategory) {
		return bookRepo.findByBookCategory(bookCategory);
	}

	@Override
	public List<Book> findByBookPriceLessThan(float bookPrice) {
		return bookRepo.findByBookPriceLessThan(bookPrice);
	}

	@Override
	public List<Book> findByBookPriceGreaterThan(float bookPrice) {
		return bookRepo.findByBookPriceGreaterThan(bookPrice);
	}

	@Override
	public List<Book> findByBookAuthorName(String authorName) {
		// TODO Auto-generated method stub
		return bookRepo.findByBookAuthorName(authorName);
	}

	@Override
	public List<Book> findByBookDescription(String description) {
		// TODO Auto-generated method stub
		return bookRepo.findByBookDescription(description);
	}

	@Override
	public List<Book> findByBookPublishingYear(Date publishingYear) {
		// TODO Auto-generated method stub
		return bookRepo.findByBookPublishingYear(publishingYear) ;
	}

   }