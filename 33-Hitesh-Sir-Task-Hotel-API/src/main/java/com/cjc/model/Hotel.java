package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hotelId;
	private String hoteName;
	private String hotelAddress;
	private String hotelRating;
	private Long hotelContactNo;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(Integer hotelId, String hoteName, String hotelAddress, String hotelRating, Long hotelContactNo) {
		super();
		this.hotelId = hotelId;
		this.hoteName = hoteName;
		this.hotelAddress = hotelAddress;
		this.hotelRating = hotelRating;
		this.hotelContactNo = hotelContactNo;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getHoteName() {
		return hoteName;
	}
	public void setHoteName(String hoteName) {
		this.hoteName = hoteName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public String getHotelRating() {
		return hotelRating;
	}
	public void setHotelRating(String hotelRating) {
		this.hotelRating = hotelRating;
	}
	public Long getHotelContactNo() {
		return hotelContactNo;
	}
	public void setHotelContactNo(Long hotelContactNo) {
		this.hotelContactNo = hotelContactNo;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hoteName=" + hoteName + ", hotelAddress=" + hotelAddress
				+ ", hotelRating=" + hotelRating + ", hotelContactNo=" + hotelContactNo + "]";
	}
	
	
	
	
	
}
