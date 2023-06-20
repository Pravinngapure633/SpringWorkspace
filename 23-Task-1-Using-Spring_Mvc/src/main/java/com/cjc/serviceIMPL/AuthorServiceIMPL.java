package com.cjc.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.AuthorDao;
import com.cjc.model.Author;
import com.cjc.service.AuthorService;

@Service
public class AuthorServiceIMPL implements AuthorService {

	@Autowired
	private AuthorDao authorDao;

	public void saveAuthor(Author author) {
		authorDao.saveAuthor(author);
	}

}
