package com.aurionpro.behavioural.state.model;

public class Delivered implements IPacket{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IPacket next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPacket previous() {
		
		return new Shift();
		
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
