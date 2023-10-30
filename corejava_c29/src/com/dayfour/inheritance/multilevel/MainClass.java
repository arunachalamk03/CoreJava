package com.dayfour.inheritance.multilevel;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Country c = new Country();
		//State s = new State();
		City c = new City();
		
		c.setCapital("Delhi");
		c.setCountrtName("India");
		c.setStateName("Tamilnadu");
		c.setLanguage("Tamil");
		c.setCityName("Tirunelveli");
		c.setPinCode(627808);
		
		System.out.println(c);

	}

}
