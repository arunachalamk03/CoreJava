package com.daythree.constructors;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		
		c = new Customer(10);
		
		c = new Customer(10,20);
		
		c = new Customer("Hello");
		
		c = new Customer("Hii",20);
		
		c = new Customer(20, "Hii");
		
		//c = new Customer(10,20,30);

	}

}
