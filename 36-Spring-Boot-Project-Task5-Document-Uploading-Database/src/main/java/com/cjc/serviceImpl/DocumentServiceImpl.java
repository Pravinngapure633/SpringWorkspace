package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Document;
import com.cjc.repository.DocumentRepository;
import com.cjc.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService{

	@Autowired
	private DocumentRepository repo;
	
	@Override
	public Document saveDocument(Document d) {
		
		return repo.save(d);
	}

	@Override
	public List<Document> getAll() {
		
		return repo.findAll();
	}

}
