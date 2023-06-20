package com.cjc.service;

import java.util.List;

import com.cjc.model.Book;

public interface BookService {

	List<Book> allBook(Book book);

	void saveBoook(Book book);
	
		
}
