package com.daythree;
import java.util.Scanner;
public class ScannerClass {
	public static void main(String args[]) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of A : ");
		a = sc.nextInt();
		System.out.print("Enter Value of B : ");
		b= sc.nextInt();
		
		c = a+b;
		
		System.out.println("C =  "+c);
		sc.close();
	}
}
