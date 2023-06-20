package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Book;
import com.cjc.repository.AuthorRepository;
import com.cjc.repository.BookRepository;
import com.cjc.repository.CategoriesRepository;
import com.cjc.repository.PublisherRepository;
import com.cjc.service.BookService;
@Service
public class BookServiceIMPL implements BookService{

		@Autowired
		private BookRepository bookRepository;
		@Autowired
		private PublisherRepository publisherRepository;
		@Autowired
		private AuthorRepository authorRepository;
		@Autowired
		private CategoriesRepository categoriesRepository;

		@Override
		public List<Book> allBook(Book book) {
			
			return bookRepository.findAll();
		}

		@Override
		public void saveBoook(Book book) {
		
			bookRepository.save(book);
		}
		
		
		
}
