package com.cjc.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.BookDao;
import com.cjc.model.Book;
import com.cjc.service.BookService;

@Service
public class BookServiceIMPL implements BookService {
	@Autowired
	private BookDao dao;

	public void saveBook(Book book) {

		dao.saveBook(book);
	}

	public List<Book> allBook(Book book) {
	
		return dao.allBook();
	}

	public List<Book> deletBook(int bookId) {
		
		List<Book> list = dao.deleteBook(bookId);
		return list;
	}

	public Book editBook(int bookId) {
		
		return dao.editBook(bookId);
	}

	

}
