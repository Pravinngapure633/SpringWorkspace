package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.serviceImpl.MailService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		MailService service = context.getBean(MailService.class);
		service.sendMail("Vishalbhakare1998@gmail.com", "Koma", "hey... Good afternoon");
	
		System.out.println("Java Mail Sending App.............");
	}

}
