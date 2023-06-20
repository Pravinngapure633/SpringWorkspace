package com.cjc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	private Integer cid;
	private String cname;
	private Long cmobileno;
	
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	private List<Product> pList;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Customer(Integer cid, String cname, Long cmobileno, List<Product> pList) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmobileno = cmobileno;
		this.pList = pList;
	}



	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Long getCmobileno() {
		return cmobileno;
	}

	public void setCmobileno(Long cmobileno) {
		this.cmobileno = cmobileno;
	}



	public List<Product> getpList() {
		return pList;
	}



	public void setpList(List<Product> pList) {
		this.pList = pList;
	}



	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cmobileno=" + cmobileno + ", pList=" + pList + "]";
	}

	
	
}
