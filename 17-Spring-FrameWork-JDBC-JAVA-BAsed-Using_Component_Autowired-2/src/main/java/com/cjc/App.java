package com.cjc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjc.Config.BeanCon;
import com.cjc.model.Developer;
import com.cjc.service.DeveloperImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ac=new AnnotationConfigApplicationContext(BeanCon.class);
        DeveloperImpl impl = ac.getBean(DeveloperImpl.class);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id");
        int id=sc.nextInt();
        System.out.println("Enter Name");
        String name=sc.next();
        impl.saveData(new Developer(id, name));
        
    }
}
