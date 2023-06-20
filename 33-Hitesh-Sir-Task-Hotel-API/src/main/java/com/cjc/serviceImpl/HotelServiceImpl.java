package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Hotel;
import com.cjc.repository.HotelRepository;
import com.cjc.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelrepo;
	
	@Override
	public Hotel saveHotel(Hotel hotel) {
		
	
	return	hotelrepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		
		return  hotelrepo.findAll();
	}

	@Override
	public List<Hotel> getAllHotelUsingFilter(String hotelAddress) {
		
			
	
			return hotelrepo.findByhotelAddress(hotelAddress);
			 
			}

	@Override
	public List<Hotel> getAllHotelUsingAddressAndRating(String hotelAddress, String hotelRating) {
		
		
		
		return hotelrepo.findByHotelAddressAndHotelRating(hotelAddress,hotelRating);
	}

}
