package com.cjc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.model.Document;
import com.cjc.service.DocumentService;
import com.google.gson.Gson;
@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	private DocumentService service;

	@PostMapping(value = "/docUpload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Document> saveDocument(@RequestPart(required = true, value = "adharcard") MultipartFile f1,
			@RequestPart(required = true, value = "pancard") MultipartFile f2,
			@RequestPart(required = true, value = "photo") MultipartFile f3, @RequestPart("doc") String doc)
			throws IOException {

		Document d = new Document();
		d.setAdharcard(f1.getBytes());
		d.setPancard(f2.getBytes());
		d.setPhoto(f3.getBytes());

		Gson g = new Gson();
		Document ds = g.fromJson(doc, Document.class);
		d.setCusId(ds.getCusId());
		d.setCusName(ds.getCusName());

		return new ResponseEntity<Document>(service.saveDocument(d), HttpStatus.CREATED);

	}
	
	@GetMapping(value = "/getAllDocument")
	public ResponseEntity<List<Document>> getAll(){
		return new ResponseEntity<List<Document>>(service.getAll(),HttpStatus.OK);
	}
}
