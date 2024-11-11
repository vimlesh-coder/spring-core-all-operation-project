package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
 
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    // Hum container se bolenge  ki mujhe sari depencies lekar de do
    //ye mujhe depencies lekar de dega yhi dependincies  injection ka means hota hai
    // ye object ko hamane ioc container ke context se nikala hai
    //getbean me student ka name paste kar denge yah mujhe ek obj de dega
        
        ApplicationContext context=new ClassPathXmlApplicationContext("confiig.xml");
  Student student1=(Student)context.getBean("student1"); 
  
  Student  student2=(Student)context.getBean("student2");
    System.out.println(student1);
    System.out.println(student2);
    
    }
}
