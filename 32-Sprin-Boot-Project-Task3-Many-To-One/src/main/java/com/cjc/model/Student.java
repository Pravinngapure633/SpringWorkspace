package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Student {

	@Id
	private Integer sId;
	private String sName;
	private String sAddress;
	private long sMobileNo;
	private String sEmail;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Department dep;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer sId, String sName, String sAddress, long sMobileNo, String sEmail, Department dep) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAddress = sAddress;
		this.sMobileNo = sMobileNo;
		this.sEmail = sEmail;
		this.dep = dep;
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public long getsMobileNo() {
		return sMobileNo;
	}

	public void setsMobileNo(long sMobileNo) {
		this.sMobileNo = sMobileNo;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Student [dep=" + dep + ", sAddress=" + sAddress + ", sEmail=" + sEmail + ", sId=" + sId + ", sMobileNo="
				+ sMobileNo + ", sName=" + sName + "]";
	}
	
	
	
}
