package com.cjc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Customer;
import com.cjc.service.CustometServiceIMPL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
    
        CustometServiceIMPL custometServiceIMPL = context.getBean(CustometServiceIMPL.class,"ds");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for insert record");
        System.out.println("Enter 2 for Update record");
        System.out.println("Enter 3 for Delete record");
        System.out.println("Enter 4 for DeleteALL record");
   
        int key=sc.nextInt();
        
        switch (key) {
		case 1:
			System.out.println("Enter Cid");
			int cid = sc.nextInt();
			System.out.println("Enter Cname");
			String cname = sc.next();
			System.out.println("Enter CProduct");
			String cproduct = sc.next();
			System.out.println("Enter Caddress");
			String caddress = sc.next();
			
//			Customer c=new Customer();
//			c.setCid(cid);
//			c.setCname(cname);
//			c.setCproduct(cproduct);
//			c.setCaddress(caddress);
//			
//			custometServiceIMPL.saveCustomer(c);
			custometServiceIMPL.saveCustomer(new Customer(cid, cname, cproduct, caddress));
			
			
			break;
		case 2:
				System.out.println("Enter cid if we want to update");
				int id=sc.nextInt();
				System.out.println("Enter new name");
				String name=sc.next();
				System.out.println("Enter new product");
				String product=sc.next();
				System.out.println("Enter new address");
				String add=sc.next();
				
				custometServiceIMPL.updateCustomer(new Customer(id, name, product, add));
				
				
			break;
		case 3:
				System.out.println("Enter cid if we want to delete information");
				int i=sc.nextInt();
				custometServiceIMPL.deleteCustomer(new Customer(i, null, null, null));
				
//				Customer c=new Customer();
//				c.setCid(sc.nextInt());
//				custometServiceIMPL.deleteCustomer(c);
			break;
		case 4:
				custometServiceIMPL.deleteAll();
				System.out.println("Done");
			break;
		default:
			break;
		}
    }
}
