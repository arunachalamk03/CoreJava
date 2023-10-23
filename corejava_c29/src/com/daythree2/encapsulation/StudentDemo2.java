package com.daythree2.encapsulation;

public class StudentDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		s.setName("Arun");
		s.setRollno(12345);
		s.setAge(21);
		System.out.println(s);
		System.out.println(s.getName());
		
		s.setName("Ram");
		s.setRollno(1345);
		s.setAge(21);
		System.out.println(s);
		
		Student s1 = new Student();
		
		s1.setName("Gokul");
		s1.setRollno(12345);
		s1.setAge(21);
		System.out.println(s1);
		

	}

}
