package com.daythree.package1;

public class BaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b = new Base();
		b.varDefault = 100;
		b.varPublic = 200;
		//b.varPrivate = 300;
		b.varProtected = 400;
		
		b.methodDefault();
		b.methodPublic();
		//b.methodPrivate();
		b.methodProtected();

	}

}
