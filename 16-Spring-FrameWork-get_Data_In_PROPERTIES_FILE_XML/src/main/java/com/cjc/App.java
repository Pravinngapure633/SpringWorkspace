package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Employee;

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
        Employee employee = (Employee)context.getBean("emp");
        System.out.println(employee);
        Employee employee1 = (Employee)context.getBean("emp1");
        System.out.println(employee1);
     
    }
}
