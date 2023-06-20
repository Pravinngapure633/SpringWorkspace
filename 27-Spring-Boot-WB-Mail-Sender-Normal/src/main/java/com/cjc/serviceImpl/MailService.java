package com.cjc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender sender;

	public void sendMail(String to,String sub,String msg)
	{
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom("Pravinnagpure633@gmail.com");
		smm.setTo(to);
		//for multiple 
		//smm.setCc("aaaa@gmail.com","adada@gmail.com","dadaad@gmail.com");
		//or
//		String[]array= {"",""};
//		smm.setCc(array);
		smm.setSubject(sub);
		smm.setText(msg);
		sender.send(smm);
		System.out.println("************Mail send succesfully************");
	}
}
