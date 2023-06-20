package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity

public class Student {

	@Id
	private Integer sRollNo;
	private String sName;
	private long sMobileNo;
	private String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer sRollNo, String sName, long sMobileNo, String address) {
		super();
		this.sRollNo = sRollNo;
		this.sName = sName;
		this.sMobileNo = sMobileNo;
		this.address = address;
	}

	public Integer getsRollNo() {
		return sRollNo;
	}

	public void setsRollNo(Integer sRollNo) {
		this.sRollNo = sRollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getsMobileNo() {
		return sMobileNo;
	}

	public void setsMobileNo(long sMobileNo) {
		this.sMobileNo = sMobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sRollNo=" + sRollNo + ", sName=" + sName + ", sMobileNo=" + sMobileNo + ", address=" + address
				+ "]";
	}
	
	
	
}
