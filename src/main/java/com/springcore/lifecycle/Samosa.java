package com.springcore.lifecycle;

public class Samosa 
{
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price)
{
	System.out.println("setting price");
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

//properties ko print ke liye to string method banate hain. 
@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

//public void init() 
public void hey()
{
	System.out.println("inside init method:hey how are you?");
}
//public void destroy() 
public void bye()
{
	System.out.println("Inside destroy method:bye bye i am going to die");
}

// in method ko call karne ke liye config me bean tag ke andar init-method="init" destroy->
}
