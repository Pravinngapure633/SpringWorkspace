package com.cjc.model;

public class Customer {
	
	private int cid;
	private String cname;
	private String cproduct;
	private String caddress;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, String cproduct, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cproduct = cproduct;
		this.caddress = caddress;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCproduct() {
		return cproduct;
	}
	public void setCproduct(String cproduct) {
		this.cproduct = cproduct;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cproduct=" + cproduct + ", caddress=" + caddress + "]";
	}
	
	

}
