package com.daythree.package2;

import com.daythree2.package1.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base();
		
		//b.varDefault = 1000;
		b.varPublic = 2000;
		//b.varPrivate = 3000;
		//b.varProtected = 4000;
		
		//b.methodDefault();
		b.methodPublic();
		//b.methodPrivate();
		//b.methodProtected();

	}

}
