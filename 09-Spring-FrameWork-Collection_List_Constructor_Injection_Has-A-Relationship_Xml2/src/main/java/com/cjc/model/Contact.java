package com.cjc.model;

public class Contact {

	private int cnum;
	private String cname;

	public Contact(int cnum, String cname) {
		super();
		this.cnum = cnum;
		this.cname = cname;
	}

	public Contact() {
		super();
	}

	public int getCnum() {
		return cnum;
	}

	public String getCname() {
		return cname;
	}

	

}
