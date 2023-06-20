package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {

	@Id
	private int cId;
	private String cName;
	
	public Categories() {
		// TODO Auto-generated constructor stub
	}

	public Categories(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Categories [cId=" + cId + ", cName=" + cName + "]";
	}

	
	
}
