package com.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
public static void main(String[] args)
{
	//ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/sconfig.xml");
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/sconfig.xml");
	
	//registering shutdownhook
		context.registerShutdownHook();
		// ab yahan pr implement karenge life cycle methods bean class me jayenge init () and destroy() banayenge
		// destroy vala method chalane ke lie hook vala metho lagana hi lagana padega 
		
		
	//Samosa s1=(Samosa)context.getBean("s1");
	//System.out.println(s1);
	
	  
	//devider
//System.out.println("++++++++++++++++++++++++++");

//Pepsi p1=( Pepsi) context.getBean("p1");

// System.out.println(p1);

Example example=(Example) context.getBean("example");
System.out.println(example);
}
}
