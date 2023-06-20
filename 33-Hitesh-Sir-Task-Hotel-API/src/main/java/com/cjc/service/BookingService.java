package com.cjc.service;

import java.util.List;

import com.cjc.model.Booking;

public interface BookingService {

	String saveBooking(Booking booking);

	List<Booking> getAllBookingUsingUserID(Integer userId);

}
