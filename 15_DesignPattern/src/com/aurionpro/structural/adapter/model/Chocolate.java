package com.aurionpro.structural.adapter.model;

public class Chocolate implements IItems{
	
	private String name;
	private double price;
	
	

	public Chocolate(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return getName();
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return getPrice();
	}

}
