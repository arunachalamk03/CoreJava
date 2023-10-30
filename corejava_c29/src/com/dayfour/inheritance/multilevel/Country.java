package com.dayfour.inheritance.multilevel;

public class Country {
	private String countrtName;
	private String capital;
	
	public String getCountrtName() {
		return countrtName;
	}
	public void setCountrtName(String countrtName) {
		this.countrtName = countrtName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + "]";
	}
	
	
	
	

}
