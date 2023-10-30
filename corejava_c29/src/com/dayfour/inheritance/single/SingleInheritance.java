package com.dayfour.inheritance.single;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Citizen c = new Citizen();
		c = new Citizen ("Arun","Chennai",90257);//Passing values using constructor
		c.setAddress("Tirunelveli");//Using Getter and Setter
		//System.out.println(c.toString());
		System.out.println(c.getName());
		System.out.println(c.getAddress());
		System.out.println(c.getPhone());
		*/
		
		Student s = new Student();
		s = new Student(9506,"Einstein College of Engineering","Arun","Chennai",48273);
		//System.out.println(s.toString());
		
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getPhone());
		System.out.println(s.getRollNo());
		System.out.println(s.getColegeName());
	
	}
}
