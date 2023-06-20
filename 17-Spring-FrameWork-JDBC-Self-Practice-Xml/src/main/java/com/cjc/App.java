package com.cjc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Employee;
import com.cjc.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		EmployeeServiceImpl employeeServiceImpl = ac.getBean(EmployeeServiceImpl.class, "em");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Insert New Emmployee Details");
		System.out.println("Enter 2 for Update Employee Detail");
		System.out.println("Enter 3 for Delete Employee Detail");

		int key = sc.nextInt();

		switch (key) {
		case 1:
			System.out.println("Enter Id :");
			int id = sc.nextInt();
			System.out.println("Enter Name");
			String nm = sc.next();
			System.out.println("Enter Address");
			String ad = sc.next();
			System.out.println("Enter Designation");
			String des = sc.next();
			System.out.println("Enter Salary");
			double sl = sc.nextDouble();

			employeeServiceImpl.saveEmployeeDetail(new Employee(id, nm, ad, des, sl));

			break;
		case 2:
			System.out.println("Enter new Name");
			String n = sc.next();
			System.out.println("Enter new Address");
			String a = sc.next();
			System.out.println("Enter new Salary");
			double s = sc.nextDouble();
			System.out.println("Enter Id for Update");
			int i = sc.nextInt();

			employeeServiceImpl.updateEmployeeDetail(new Employee(i, n, a, null, s));
			break;

		case 3:
			System.out.println("Enter Id To Delete Employee Details");
			int d = sc.nextInt();

			employeeServiceImpl.deleteEmployeeDetail(new Employee(d, null, null, null, 0));
			break;
		default:
			System.out.println("Please Enter Correct Output");
			break;
		}

	}
}
