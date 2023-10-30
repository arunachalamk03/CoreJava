package com.dayfour.inheritance.single;


// Super class or Parent Class
public class Citizen {
	private String name ;
	private String address;
	private int phone;
	public Citizen() {
		super();
		System.out.println("Object Created");
		// TODO Auto-generated constructor stub
	}
	
	public Citizen(String name, String address, int phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
}
