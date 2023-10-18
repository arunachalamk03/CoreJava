package com.daythree;

public class Loops {

	public static void main(String[] args) {
		int a = 1;
		int i = 0;
		while(i<5) {
			System.out.println("While Loop "+i);
			i++;
		}
		
		System.out.println(" ");
		
		for(i=0;i<10;i++) {
			System.out.println("For Loop "+i);
		}
		
		System.out.println(" ");
		
		i =0;
		do {
			System.out.println("Do While Loop "+i);
			i++;
		}while(i<=5);

	}

}
