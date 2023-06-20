package com.cjc.service;

import java.util.List;
import java.util.Optional;

import com.cjc.model.Hotel;

public interface HotelService {

	

	List<Hotel> getAllHotel();

	Hotel saveHotel(Hotel hotel);

	List<Hotel> getAllHotelUsingFilter(String hotelAddress);

	List<Hotel> getAllHotelUsingAddressAndRating(String hotelAddress, String hotelRating);

}
