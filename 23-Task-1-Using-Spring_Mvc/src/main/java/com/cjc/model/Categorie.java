package com.cjc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Categorie {

	@Id
	private int categorieId;
	private String categorieName;
	
	@ManyToMany
	private List<Book> book;

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(int categorieId, String categorieName, List<Book> book) {
		super();
		this.categorieId = categorieId;
		this.categorieName = categorieName;
		this.book = book;
	}

	public int getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(int categorieId) {
		this.categorieId = categorieId;
	}

	public String getCategorieName() {
		return categorieName;
	}

	public void setCategorieName(String categorieName) {
		this.categorieName = categorieName;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	

	
}
