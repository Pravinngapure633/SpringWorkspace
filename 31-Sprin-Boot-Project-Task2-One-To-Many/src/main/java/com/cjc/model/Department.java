package com.cjc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
public class Department {

	@Id
	private Integer dId;
	private String dName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Student> sList;

	

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Department(Integer dId, String dName, List<Student> sList) {
	
		this.dId = dId;
		this.dName = dName;
		this.sList = sList;
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



	public List<Student> getsList() {
		return sList;
	}



	public void setsList(List<Student> sList) {
		this.sList = sList;
	}



	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", sList=" + sList + "]";
	}

	
}
