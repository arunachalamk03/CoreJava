package com.daytwo;

public class ConditionalStatements {
	
	public static void main(String args[]) {
		int a = 3, b = 7;
		
		//IF Condition
		if (a<b) {
			System.out.println("B is Big");
			}
		if(a>b) {
			System.out.println("A is Big");
		}
		
		//IF else Condition
		if (a<b) {
			System.out.println("B is Big");
		}
		else {
			System.out.println("A is Big");
		}
		
		//IF else if Condition
		if (a<b) {
			System.out.println("B is Big");
		}
		else if(a==b) {
			System.out.println("A and B are Equal");
		}
		else {
			System.out.println("A is Big");
		}
	}


}
