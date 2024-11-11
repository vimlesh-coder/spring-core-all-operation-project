package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//disposable hame ye functionality de dega destroy ke vakt function chalane ki 
public class Pepsi implements InitializingBean,DisposableBean

{
private double price;
 
public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	// ye method init ka work karega property ko set karne ke bad chalega ye de destroy ki functionality nahi deta hai

System.out.println("taking pepsi:init");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Going to put bottle back to shop:destroy ");
}


}
