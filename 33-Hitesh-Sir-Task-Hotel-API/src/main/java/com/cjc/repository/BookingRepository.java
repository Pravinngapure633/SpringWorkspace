package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{

	

	List<Booking> findByuserId(Integer userId);
}
