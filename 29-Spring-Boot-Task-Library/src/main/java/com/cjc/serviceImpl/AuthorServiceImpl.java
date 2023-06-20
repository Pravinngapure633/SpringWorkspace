package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Author;
import com.cjc.repository.AuthorRepository;
import com.cjc.service.Authorservice;
@Service
public class AuthorServiceImpl implements Authorservice {

	@Autowired
	private AuthorRepository arepo;
	@Override
	public void saveAuthor(Author author) {
		
		Author save = arepo.save(author);
		
	}
	@Override
	public List<Author> allBook(Author author) {
		
		
		return arepo.findAll();
	}

}
