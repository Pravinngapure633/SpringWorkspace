package com.cjc.service;

import java.util.List;

import com.cjc.model.Book;

public interface BookService {
	
	public void saveBook(Book book);

	public List<Book> allBook(Book book);

	public List<Book> deletBook(int bookId);

	public Book editBook(int bookId);

	
}
