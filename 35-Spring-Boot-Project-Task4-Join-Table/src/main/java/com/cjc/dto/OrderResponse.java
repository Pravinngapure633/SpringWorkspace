package com.cjc.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {
	
	private String cname;
	private String pname;
	private double price;
	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public OrderResponse(String cname, String pname, double price) {
		super();
		this.cname = cname;
		this.pname = pname;
		this.price = price;
	}



	//Price no
	public OrderResponse(String cname, String pname) {
		super();
		this.cname = cname;
		this.pname = pname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderResponse [cname=" + cname + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
	
	
	

}
