package com.dayfour.inheritance.single;
// Sub class or Child Class
public class Student extends Citizen {
	//private String name;
	//private int phone;
	//private String address;
	private int rollNo;
	private String colegeName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	public Student(String name, String address, int phone) {
		super(name, address, phone);
		// TODO Auto-generated constructor stub
	}
	*/
	public Student(int rollNo, String colegeName, String name, String address, int phone) {
		super(name, address, phone);
		this.rollNo = rollNo;
		this.colegeName = colegeName;

	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getColegeName() {
		return colegeName;
	}
	public void setColegeName(String colegeName) {
		this.colegeName = colegeName;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", colegeName=" + colegeName + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + "]";
	}
	
	
}
