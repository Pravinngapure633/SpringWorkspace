package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	private Integer dId;
	private String dName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Integer dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}
	public Integer getdId() {
		return dId;
	}
	public void setdId(Integer dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}
	
	
	
}
