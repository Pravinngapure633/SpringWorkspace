package com.cjc.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cjc.model.Booking;
import com.cjc.model.Hotel;
import com.cjc.model.UserDetail;
import com.cjc.repository.BookingRepository;
import com.cjc.repository.HotelRepository;
import com.cjc.repository.UserRegistrationRepository;
import com.cjc.service.BookingService;
@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository brepo;
	
	@Autowired
	private UserRegistrationRepository urepo;
	
	@Autowired
	private HotelRepository hrepo;
	
	@Autowired
	private JavaMailSender sender;

	@Override
	public String saveBooking(Booking booking) {
		
		if(urepo.existsById(booking.getUserId())&&
				hrepo.findById(booking.getHotelId()).get().getHotelId()==booking.getHotelId()) {
			
			UserDetail user = urepo.findById(booking.getUserId()).get();
			//Hotel hotel = hrepo.findById(booking.getHotelId()).get();
			
			System.out.println(user);
			
			List<Booking> list = user.getlBooking();
			list.add(booking);
			
			brepo.save(booking);
			urepo.save(user);
			
			SimpleMailMessage msg=new SimpleMailMessage();
			msg.setTo(user.getEmail());
			msg.setText("Mr."+user.getName()+"Your Booking  Success \n Booking Details:-\n "+booking.toString());
			sender.send(msg);
			
			return "Save";
			
		}
		else {
			return "Not Saved";
		}
		
		
	}


	@Override
	public List<Booking> getAllBookingUsingUserID(Integer userId) {
		
		List<Booking> list = brepo.findByuserId(userId);
		return list;
	}
	
	
}
