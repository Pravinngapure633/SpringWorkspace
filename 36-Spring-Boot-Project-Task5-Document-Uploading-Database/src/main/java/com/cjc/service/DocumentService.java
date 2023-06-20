package com.cjc.service;

import java.util.List;

import com.cjc.model.Document;

public interface DocumentService {

	Document saveDocument(Document d);

	List<Document> getAll();

}
