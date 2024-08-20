package com.haruns._15_InterfaceOrnek;

public class DvdPlayer implements Player{
	@Override
	public void play() {
		System.out.println("Dvd player is playing");
		
	}
	
	@Override
	public void stop() {
		System.out.println("Dvd player is stopping");
		
	}
	
	@Override
	public void pause() {
		System.out.println("Dvd player is paused");
		
	}
}