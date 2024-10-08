package com.aurionpro.creational.factory.model;

public class AccountFactory {
	public static IAccount makeAccount(String name, double balance) {
		IAccount account = null;
		
		if(name == "Savings")
			account = new SavingsAccount(balance);
		if(name == "Current")
			account = new CurrentAccount(balance);
		
		return account;
	}
}
