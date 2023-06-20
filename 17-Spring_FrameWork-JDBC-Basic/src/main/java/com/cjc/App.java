package com.cjc;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext acc=new ClassPathXmlApplicationContext("Bean.xml");
        
        JdbcTemplate template =acc.getBean(JdbcTemplate.class,"template");
        
        String insert="insert into Student values(1,'Pravin','Pune',98889955)";
        
        template.update(insert);
        System.out.println("Done");
    }
}
