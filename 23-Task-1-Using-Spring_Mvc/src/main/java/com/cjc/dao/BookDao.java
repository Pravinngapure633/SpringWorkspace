package com.cjc.dao;

import java.util.List;

import com.cjc.model.Book;

public interface BookDao {

	void saveBook(Book book);

	List<Book> allBook();


	List<Book> deleteBook(int bookId);

	Book editBook(int bookId);

	
	

}
