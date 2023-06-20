package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	private Integer userId;
	private Integer hotelId;
	private String checkInDate;
	private String checkOutDate;
	private Integer roomBooks;
	private Double price;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Booking(Integer bookingId, Integer userId, Integer hotelId, String checkInDate, String checkOutDate,
			Integer roomBooks, Double price) {
		super();
		this.bookingId = bookingId;
		this.userId =userId;
		this.hotelId = hotelId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomBooks = roomBooks;
		this.price = price;
	}

	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setId(Integer userId) {
		this.userId = userId;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public Integer getRoomBooks() {
		return roomBooks;
	}
	public void setRoomBooks(Integer roomBooks) {
		this.roomBooks = roomBooks;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", hotelId=" + hotelId + ", checkInDate="
				+ checkInDate + ", checkOutDate=" + checkOutDate + ", roomBooks=" + roomBooks + ", price=" + price
				+ "]";
	}
	
	
	
	
	
}
