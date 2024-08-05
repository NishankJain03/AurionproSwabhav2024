package com.aurionpro.structural.facade.model;

public class SoundSystem implements TurnOn{

	@Override
	public void On() {
		System.out.println("Sound System is turned On");
		
	}
	
	public void setVolume(int volume) {
		System.out.println("Volume has been set to " + volume + " %" );
	}
	
}
