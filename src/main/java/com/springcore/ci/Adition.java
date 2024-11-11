package com.springcore.ci;

public class Adition 
{
//Abmbiguity ke lie 
	private int a;
	private int b;
	public Adition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("constructor:int,int");
	}
	public  Adition(double a,double b) {
		
		this.a=(int)a;
		this.b=(int)b;
	 
		System.out.println("constructor:double,double");
	}
	
	//but is case me string string constructor nahi hota/ yah top se value ko print kar dega 
	//agar usko value by default usko is class me string string parameter ke andar mil jatee hai to vah phle usee parameter ko call karega
	//agar usko is class me string string value nahi miltee hai to vah top se print kar dega
	
	public Adition(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		
	 
		System.out.println("constructor:String,String");
	}
	
	public void dosum() {
		System.out.println("value of a"+this.a);
		System.out.println("value of b"+this.b);
		System.out.println("sum is="+(this.a+this.b));
	}
}
