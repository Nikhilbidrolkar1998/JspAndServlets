package com.bookapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBootappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootappJdbcApplication.class, args);
	}

	@Autowired
	IBookService bookService;
	@Override
	public void run(String... args) throws Exception {
//		Book book=new Book("Spring","Rahul","Tech",102,30000);
//		bookService.addBook(book);
		
//		List<Book> books=bookService.getAll();
//		for(Book book:books) {
//			System.out.println(book);
//		}
		
		Book books=bookService.getById(100);
		System.out.println(books);
	}

}
