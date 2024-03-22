package com.bookapp.repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class BookRepositoryImpl implements IBookRepository {
	private JdbcTemplate jdbcTemplate;
	
	

	public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addBook(Book book) {
		Object[] bookArr= {book.getTitle(),book.getAuthor(),book.getPrice(),book.getCategory()};
		jdbcTemplate.update(Queries.INSERTQUERY,bookArr);
 		
	}

	@Override
	public void updateBook(int bookId, double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY,price,bookId);
		
	}

	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY,bookId);
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		Book book=jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY,new BookMapper(),bookId);
		return book;
	}

	@Override
	public List<Book> findAll() {
		org.springframework.jdbc.core.RowMapper<Book> mapper=new BookMapper();
		List<Book> books=jdbcTemplate.query(Queries.SELECTQUERY, mapper);
		return books;
	}

	@Override
	public List<Book> findByAuthor(String author) throws BookNotFoundException {
		return jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY,(rs, rowNum)->{
			Book book=new Book();
			book.setAuthor(rs.getString("author"));
			book.setBookId(rs.getInt("book_id"));
			book.setTitle(rs.getString("title"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			return book;
		},author);
		
			
		
	}

	@Override
	public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
		List<Book> books=jdbcTemplate.query(Queries.SELECTBYPRICEQUERY, new BookMapper(),price);
		return books;
	}

	@Override
	public List<Book> findByAuthorCategory(String author, String Category) throws BookNotFoundException {
		List<Book> books=jdbcTemplate.query(Queries.SELECTBYAUTHCATQUERY, new BookMapper(),author,Category);
		return books;
	}
    
}
