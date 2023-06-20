package com.cjc.model;

public class Account {

	private int userId;
	private String password;
	private long acNo;
	private String acName;
	private String address;
	private String addharNo;
	private String panNo;;
	private long mobileNo;
	private String gender;
	private String emailId;
	private double balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Account(int userId, String password, long acNo, String acName, String address, String addharNo, String panNo,
			long mobileNo, String gender, String emailId, double balance) {
		super();
		this.userId = userId;
		this.password = password;
		this.acNo = acNo;
		this.acName = acName;
		this.address = address;
		this.addharNo = addharNo;
		this.panNo = panNo;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.emailId = emailId;
		this.balance = balance;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public long getAcNo() {
		return acNo;
	}


	public void setAcNo(long acNo) {
		this.acNo = acNo;
	}


	public String getAcName() {
		return acName;
	}


	public void setAcName(String acName) {
		this.acName = acName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getAddharNo() {
		return addharNo;
	}


	public void setAddharNo(String addharNo) {
		this.addharNo = addharNo;
	}


	public String getPanNo() {
		return panNo;
	}


	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String toString() {
		return "*****Account Detail's*****"
				+"\nAccount holder Account No  :" + acNo 
				+"\nAccount Holder Name        :"+acName
				+"\nAccount holder Address     :" + address
				+"\nAccount holder Mobileno    :" + mobileNo 
				+"\nAccount holder Adhar No    :" + addharNo
				+"\nAccount holder Pan No      :" + panNo 
				+"\nAccount Holder Email Id    :"+ emailId
				+"\nAccount holder Balance     :" + balance 
				+"\nAccount holder Gender      :"+ gender
				+"\nAccount holder userId      :" + userId 
				+"\nAccount holder Password    :" + password;
	}
	
}
