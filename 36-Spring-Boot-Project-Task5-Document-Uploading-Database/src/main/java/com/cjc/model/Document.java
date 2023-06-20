package com.cjc.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer docId;
	private Integer cusId;
	private String cusName;
	@Lob
	private byte[] adharcard;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] photo;
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Document(Integer docId, Integer cusId, String cusName, byte[] adharcard, byte[] pancard, byte[] photo) {
		super();
		this.docId = docId;
		this.cusId = cusId;
		this.cusName = cusName;
		this.adharcard = adharcard;
		this.pancard = pancard;
		this.photo = photo;
	}
	public Integer getDocId() {
		return docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	public Integer getCusId() {
		return cusId;
	}
	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public byte[] getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(byte[] adharcard) {
		this.adharcard = adharcard;
	}
	public byte[] getPancard() {
		return pancard;
	}
	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Document [docId=" + docId + ", cusId=" + cusId + ", cusName=" + cusName + ", adharcard="
				+ Arrays.toString(adharcard) + ", pancard=" + Arrays.toString(pancard) + ", photo="
				+ Arrays.toString(photo) + "]";
	}
	
	
	
	
}
