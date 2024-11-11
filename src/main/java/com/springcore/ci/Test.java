package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	Person p=(Person) context.getBean("person");
	// variable person type ka hoga to person me store kar lete hain
	System.out.println(p);
	
	Adition add=(Adition) context.getBean("add");
	add.dosum();
	
	}

}