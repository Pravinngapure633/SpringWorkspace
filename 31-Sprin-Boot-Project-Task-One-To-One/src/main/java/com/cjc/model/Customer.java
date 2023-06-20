package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	private Integer cId;
	private String cName;
	private Integer cMobile;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer cId, String cName, Integer cMobile, Address address) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cMobile = cMobile;
		this.address = address;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcID(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Integer getcMobile() {
		return cMobile;
	}

	public void setcMobile(Integer cMobile) {
		this.cMobile = cMobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cID=" + cId + ", cName=" + cName + ", cMobile=" + cMobile + ", address=" + address + "]";
	}

}
