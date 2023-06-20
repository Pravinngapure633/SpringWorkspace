package com.cjc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Publisher {

	@Id
	private String publishId;
	private String publishName;
	private String publishDate;
	@ManyToMany
	private List<Book> book;

	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publisher(String publishId, String publishName, String publishDate, List<Book> book) {
		super();
		this.publishId = publishId;
		this.publishName = publishName;
		this.publishDate = publishDate;
		this.book = book;
	}

	public String getPublishId() {
		return publishId;
	}

	public void setPublishId(String publishId) {
		this.publishId = publishId;
	}

	public String getPublishName() {
		return publishName;
	}

	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	
}
