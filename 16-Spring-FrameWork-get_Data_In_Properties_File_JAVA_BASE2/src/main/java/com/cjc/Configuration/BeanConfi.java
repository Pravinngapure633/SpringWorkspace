package com.cjc.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cjc.model.Employee;

@Configuration //to make java class as spring bean configuration class
@ComponentScan(basePackages = "com.cjc")
@PropertySource(value = "info.properties")
public class BeanConfi {

	@Bean //this is method level annotation for creating custom bean
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setName("Pravin");
		emp.setDesig("Develpoer");
		return emp;
	}
}
