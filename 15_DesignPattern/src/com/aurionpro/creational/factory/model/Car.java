package com.aurionpro.creational.factory.model;

public enum Car {
	MARUTI, TATA, MAHINDRA;
	
	public String toString() {
		switch (this) {
		case MARUTI:
			return "Maruti";
		case MAHINDRA:
			return "Mahindra";
		case TATA:
			return "Tata";
		default:
			return "Default";
		}
	}
}
