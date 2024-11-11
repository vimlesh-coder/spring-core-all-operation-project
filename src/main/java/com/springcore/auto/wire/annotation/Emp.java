package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp 
{
	//property me and setter me constructor ke sath use kar sakte hain
	//agar usko reference sahi nhi milta to err no such font exception de dega
	//@Qualifier ye batata hai ki kis bean ke name ko inject karna hai
	
	@Autowired
	@Qualifier("temp1")
//class depend karega sirf address par
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	  //@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	
	 
}
