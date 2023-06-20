package com.cjc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cjc.model.UserDetail;
import com.cjc.repository.UserRegistrationRepository;
import com.cjc.service.UserRegistrationService;
@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationRepository userRegRepo;
	
	@Autowired
	private JavaMailSender sender;

	@Override
	public void createProfile(UserDetail userdetail) {
		
		userRegRepo.save(userdetail);
		SimpleMailMessage msg= new SimpleMailMessage();
		msg.setTo(userdetail.getEmail());
		msg.setText("Account Create");
		sender.send(msg);
		
		
	}

	@Override
	public UserDetail loginCheck(String userName, String userPassword) {
		
			UserDetail user = userRegRepo.findByuserName(userName);
		if(user.getUserName().equals(userName)&&user.getUserPassword().equals(userPassword))
		{
			System.out.println("Login Success");
			return user;
		}
		else {
			System.out.println("Wrong UserName And Password");
			return null;	
		}
		
	}
}
