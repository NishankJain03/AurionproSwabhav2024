package com.aurionpro.behavioural.state.model;

public class Shift implements IPacket{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public IPacket next() {
		// TODO Auto-generated method stub
		return new Delivered();
	}

	@Override
	public IPacket previous() {
		return new Ordered();
		
	}

	@Override
	public IPacket current() {
		return this;
		
	}

	@Override
	public boolean hasPrevious() {
		return true;
	}

}
