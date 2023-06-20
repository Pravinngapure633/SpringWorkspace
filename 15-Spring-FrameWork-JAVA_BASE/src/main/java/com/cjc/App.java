package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjc.Configuration.BeanConfi;
import com.cjc.model.Company;
import com.cjc.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfi.class);
//		Employee employee = context.getBean(Employee.class, "getEmployee");
//		System.out.println(employee);
		Company company = context.getBean(Company.class);
		System.out.println(company.getCompanyDetails());
	}
}
