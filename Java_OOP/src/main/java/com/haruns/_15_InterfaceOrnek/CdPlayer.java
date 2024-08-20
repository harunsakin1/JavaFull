package com.haruns._15_InterfaceOrnek;

public class CdPlayer implements Player{
	@Override
	public void play() {
		System.out.println("Cd player is playing");
	}
	
	@Override
	public void stop() {
		System.out.println("Cd player is stopping");
		
	}
	
	@Override
	public void pause() {
		System.out.println("Cd player is paused");
	
	}
}