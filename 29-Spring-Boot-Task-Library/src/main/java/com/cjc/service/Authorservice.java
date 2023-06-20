package com.cjc.service;

import java.util.List;

import com.cjc.model.Author;

public interface Authorservice {

	void saveAuthor(Author author);

	List<Author> allBook(Author author);

}
