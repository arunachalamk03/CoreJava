package com.daytwo;

public class ClassExample {
	
	void Hi() {
		System.out.println("Hi");
	}
	
	void Hello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println("Main Function");
		ClassExample obj = new ClassExample();
		
		obj.Hi();
		obj.Hello();
		
		Print PrintObj = new Print();
		PrintObj.printText();
	}

}
