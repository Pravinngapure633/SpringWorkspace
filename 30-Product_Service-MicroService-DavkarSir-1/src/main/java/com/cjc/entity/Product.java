package com.cjc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int oroductId;
	private String productName;
	private String productPrice;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getOroductId() {
		return oroductId;
	}

	public void setOroductId(int oroductId) {
		this.oroductId = oroductId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [oroductId=" + oroductId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	public Product(int oroductId, String productName, String productPrice) {
		super();
		this.oroductId = oroductId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
}
