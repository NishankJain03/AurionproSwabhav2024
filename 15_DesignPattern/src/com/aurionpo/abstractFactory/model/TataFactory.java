package com.aurionpo.abstractFactory.model;

public class TataFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		return new Tata();
	}
	
}
