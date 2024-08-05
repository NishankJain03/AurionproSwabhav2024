package com.aurionpro.isp.violation.model;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Robot has started the work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot has stopped the work");
		
	}

	@Override
	public void eat() {
		System.out.println("Robot is eating");
		
	}

	@Override
	public void drink() {
		System.out.println("Robot is drinking");
		
	}
	
}
