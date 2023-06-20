package com.cjc;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.cjc.model.Address;
import com.cjc.model.Book;
import com.cjc.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception    {
        System.out.println( "Hello World!" );
        
        List<Book> blist=new ArrayList<Book>();
        blist.add(new Book(201, "Java", 450.50));
        blist.add(new Book(202, "Phython", 300.50));
        blist.add(new Book(203, "C++", 650.50));
        
        
        Address adr=new Address();
        adr.setPincode(441904);
        adr.setCity("Pune");
        adr.setArea("Akrudi");
        
        Student stu=new Student();
        stu.setRollno(101);
        stu.setName("XYZ");
        stu.setMobile(8956523l);
        stu.setAddress(adr);
        stu.setBook(blist);
       
        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(new FileWriter("Student.json"), stu);
        System.out.println("Data Writed");
    }
}
