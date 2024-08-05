package com.aurionpro.model;

public enum Type {
	ACOUSTIC, ELECTRIC;
	
	public String toString() {
		switch (this) {
		case ACOUSTIC:
			return "acoustic";
		case ELECTRIC:
			return "electric";
		default:
			return "default";
		}
	}
}
