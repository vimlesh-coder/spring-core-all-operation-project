package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
public static void main(String[] args) 
{
	//path ke lie / ka use karte hain
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");

Person person1=(Person) con.getBean("person1",Person.class);

System.out.println(person1);

System.out.println(person1.getFriends().getClass().getName());

System.out.println("---------------------------------------------------------------------");

System.out.println(person1.getFeestructure());
System.out.println(person1.getFeestructure().getClass().getName());

System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

System.out.println(person1.getProperties());





}
}
