package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text 
{
public static void main(String[] args) 
{
	ApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
	
	//agar type casting nhi karna hai to sbse pahle bean ka name(emp1),type(Emp.class); mujhe type casting nahi karni padegi yah khud se value Emp class ke  emp me de dega
	//yah mujhe khud se typecast karke de dega Emp ka object de dega
	
	//Emp emp1=(Emp) context.getBean("emp1");
	
	
	Emp emp1=context.getBean("emp1",Emp.class);
	
	System.out.println(emp1);



}
}
