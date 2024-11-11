

package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example 
{
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Example [subject=" + subject + "]";
}

//abhi ye method nahi chalenge kyonki hamne na to inhe xml me bataya na hi interface me bataya hai aur na hi hamne annotation ka use kiya hai.
@PostConstruct
public void start() 
{
	System.out.println("starting method");
}

//@PostConstruct,@PreDestroy bye default ye diable hote hain inhe enable krna hoga 
@PreDestroy
public void destroy() 
{
	System.out.println("ending method");
}
}
