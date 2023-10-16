package com.daytwo;

public class OperatorExamples {
	
public static void main(String args[]) {
		
		int a = 50, b = 8;
		float c ;
		
		// Arithmetic Operators
		c = a+b;
		System.out.println("Addition : " + c);
		
		c = a-b;
		System.out.println("Subtraction : " + c);
		
		c = a*b;
		System.out.println("Multiplication : " + c);
		
		c = a/b;
		System.out.println("Division : " + c);
		
		c = a%b;
		System.out.println("Mod : " + c);
		
		// Assignment Operators
		
		c = a;
		System.out.println("Assignment : " + c);
		
		c += a;
		System.out.println("Addition and Assignment : " + c);
		
		c *= a;
		System.out.println("Multiplication and Assignment : " + c);
		
		//Increment/Decrement
		
		a++;
		System.out.println("Post Increment of A : " + a);
		
		++a;
		System.out.println("Pre Increment of A : " + a);
		
		a--;
		System.out.println("Post Decrement of A : " + a);
		
		--a;
		System.out.println("Pre Decrement of A : " + a);
		
		// Relational Operators
		System.out.println("A == B : " + (a == b));
		
		System.out.println("A > B : " + (a > b));
		
		System.out.println("A >= B : " + (a >= b));
		
		System.out.println("A < B : " + (a < b));
		
		System.out.println("A <= B : " + (a <= b));
		
		System.out.println("A != B : " + (a != b));
	}

}
