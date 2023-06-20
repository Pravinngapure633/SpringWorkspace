package com.cjc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String userName;
	private String userPassword;
	private Long mobileNo;
	private String email;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Booking> lBooking=new ArrayList<Booking>();
	

	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserDetail(Integer id, String name, String userName, String userPassword, Long mobileNo, String email,
			List<Booking> lBooking) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.userPassword = userPassword;
		this.mobileNo = mobileNo;
		this.email = email;
		this.lBooking = lBooking;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public Long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Booking> getlBooking() {
		return lBooking;
	}


	public void setlBooking(List<Booking> lBooking) {
		this.lBooking = lBooking;
	}


	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", name=" + name + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", mobileNo=" + mobileNo + ", email=" + email + ", lBooking=" + lBooking + "]";
	}


	
	

}
