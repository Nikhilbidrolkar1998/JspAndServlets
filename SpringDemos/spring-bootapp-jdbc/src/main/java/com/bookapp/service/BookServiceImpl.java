package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;
import com.bookapp.repository.BookRepositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookRepository bookRepository;
	@Override
	public void addBook(Book book) {
		bookRepository.addBook(book);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		bookRepository.updateBook(bookId, price);
	}

	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteBook(bookId);
		
	}

	@Override
	public List<Book> getAll() {
		List<Book> books=bookRepository.findAll();
		if(books.isEmpty())
			throw new BookNotFoundException("No books found");
		return books;
	}

	@Override
	public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
		List<Book> books=bookRepository.findByAuthor(author);
		if(books.isEmpty())
			throw new BookNotFoundException("No books found");
		return books;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
//		List<Book> books=bookRepository;
//		if(books.isEmpty())
//			throw new BookNotFoundException("No books found");
		return null;
	}

	@Override
	public List<Book> getByPrice(double price) throws BookNotFoundException {
		List<Book> books=bookRepository.findByLesserPrice(price);
		if(books.isEmpty())
			throw new BookNotFoundException("No books found");
		return books;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books=bookRepository.findByAuthorCategory(author,category);
		if(books.isEmpty())
			throw new BookNotFoundException("No books found");
		return books;
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		Book book=bookRepository.getById(bookId);
		if(book==null)
			throw new IdNotFoundException("Invalid Id");
		return book;
	}
   
}
