package com.cjc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cjc.model.Mobile;

@Configuration
@ComponentScan(basePackages = "com.cjc")
public class BeanConfiguration {
	@Bean
	public Mobile getMobile() {
		Mobile m=new Mobile();
		m.setPrice(100000);
		m.setName("Poco");
		return m;
	}

}
