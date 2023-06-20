package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Hotel;
@Repository
public interface HotelRepository  extends JpaRepository<Hotel, Integer>{

	List<Hotel> findByhotelAddress(String hotelAddress);

	List<Hotel> findByHotelAddressAndHotelRating(String hotelAddress, String hotelRating);
	
//	@Query("select hotel where hotelAddress=?")
//	public Optional<Hotel> FindAllHotelByCityName(String hotelAddress); 

}
