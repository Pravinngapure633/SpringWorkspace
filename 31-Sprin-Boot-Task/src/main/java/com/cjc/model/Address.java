package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private Integer aPinCode;
	private String area;
	private String landMark;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Integer aPinCode, String area, String landMark) {
		super();
		this.aPinCode = aPinCode;
		this.area = area;
		this.landMark = landMark;
	}
	public Integer getaPinCode() {
		return aPinCode;
	}
	public void setaPinCode(Integer aPinCode) {
		this.aPinCode = aPinCode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	
	
	
	
	
}
