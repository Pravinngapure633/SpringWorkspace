package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Publisher {

	@Id
	private int pId;
	private String pName;
	
	public Publisher() {
		// TODO Auto-generated constructor stub
	}

	public Publisher(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Publisher [pId=" + pId + ", pName=" + pName + "]";
	}
	
}

