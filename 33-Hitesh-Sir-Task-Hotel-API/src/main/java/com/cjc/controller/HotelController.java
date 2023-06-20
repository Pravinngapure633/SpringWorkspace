package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Booking;
import com.cjc.model.Hotel;
import com.cjc.model.UserDetail;
import com.cjc.service.BookingService;
import com.cjc.service.HotelService;
import com.cjc.service.UserRegistrationService;

@RestController
public class HotelController {

	@Autowired
	private UserRegistrationService userRegService;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private BookingService bookingService;
	
	
	
	
	//*************create account for new user************
	@PostMapping(value = "/createProfile")
	public ResponseEntity<String> createProfile(@RequestBody UserDetail userdetail){
		
		userRegService.createProfile(userdetail);
		
		String msg="******Registration Success******\n"+"UserName :"+userdetail.getUserName()+"   "+"UserPassword :"+userdetail.getUserPassword();
	
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	//****************login check*************
	@GetMapping(value = "/loginCheck/{UserName}/{Password}")
	public ResponseEntity<UserDetail> loginCheck(@PathVariable("UserName") String userName,@PathVariable("Password") String userPassword){
		
		return new ResponseEntity<UserDetail>(userRegService.loginCheck(userName,userPassword),HttpStatus.OK);		
	}
	
	
	//***********Hotel**********
	@PostMapping(value = "/saveHotel")
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
		
		return new ResponseEntity<Hotel>(hotelService.saveHotel(hotel),HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getAllHotel")
	public ResponseEntity<List<Hotel>> saveHotel(){
		
		//hotelService.saveHotel(hotel);
		
		return new ResponseEntity<List<Hotel>>(hotelService.getAllHotel(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllHotel/{city}")
	public ResponseEntity<List<Hotel>> getAllHotelUsingFilter(@PathVariable("city") String hotelAddress){
		
		return new ResponseEntity<List<Hotel>>(hotelService.getAllHotelUsingFilter(hotelAddress),HttpStatus.OK);
	}
	@GetMapping(value = "/getAllHotel/{city}/{rating}")
	public ResponseEntity<List<Hotel>> getAllHotelUsingAddressAndRating(@PathVariable("city") String hotelAddress,@PathVariable("rating") String hotelRating ){
		
		return new ResponseEntity<List<Hotel>>(hotelService.getAllHotelUsingAddressAndRating(hotelAddress,hotelRating),HttpStatus.OK);
	}
	
	//***************Booking**************************
	@PostMapping(value = "/saveBooking")
	public ResponseEntity<String> saveBooking(@RequestBody Booking booking){
		  bookingService.saveBooking(booking);
		return new ResponseEntity<String>("Booking sucess",HttpStatus.OK);
		
	}
	@GetMapping(value = "/getAllBookingUsingUserID/{userId}")
	public ResponseEntity<List<Booking>> getAllBookingUsingUserID(@PathVariable Integer userId){
		
		return new ResponseEntity<List<Booking>>(bookingService.getAllBookingUsingUserID(userId),HttpStatus.OK);
	}
	
	
}
