package com.cjc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjc.confi.BeanConfi;
import com.cjc.model.Mobile;
import com.cjc.service.MobileServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfi.class);
		MobileServiceImpl impl = ac.getBean(MobileServiceImpl.class, "MobileServiceImpl");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Insert MObile Data");
		System.out.println("Enter 2 for Update MObile Data");
		System.out.println("Enter 3 for GetSingle MObile Data");
		System.out.println("Enter 4 for GetAll MObile Data");
		System.out.println("Enter 5 for DeleteSingle MObile Data");
		System.out.println("Enter 6 for DeleteAll MObile Data");

		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("Enter Id");
			int id = sc.nextInt();
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter Price");
			double price = sc.nextDouble();
			System.out.println("Enter Specification");
			String speci = sc.next() + sc.nextLine();
			System.out.println("Enter Warrenty");
			String wa = sc.next();
			impl.saveMobile(new Mobile(id, name, price, speci, wa));
			break;
		case 2:
			System.out.println("Enter new name");
			String nm = sc.next();
			System.out.println("Enter new price");
			double pr = sc.nextDouble();
			System.out.println("Enter Id");
			int i = sc.nextInt();

			impl.updateMobile(new Mobile(i, nm, pr, null, null));

			break;

		case 3:
			System.out.println("Enter id");
			Mobile mo = impl.getSingleMobile(sc.nextInt());
			System.out.println(mo);
			break;
		case 4:
			List<Mobile> mobile = impl.getAllMobile();
			for (Mobile mobile2 : mobile) {
				System.out.println(mobile2);
			}
			break;
		case 5:
			System.out.println("Enter Id to delete");
			int a = sc.nextInt();
			impl.deleteMobile(new Mobile(a, null, 0, null, null));
			break;
		case 6:
			impl.deleteAllMobile();
			break;
		default:
			break;
		}
	}
}
