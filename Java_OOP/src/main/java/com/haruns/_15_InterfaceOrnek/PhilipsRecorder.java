package com.haruns._15_InterfaceOrnek;

public class PhilipsRecorder implements Recorder {
	@Override
	public void record() {
		System.out.println("Philips Recorder is recording");
	}
	
	@Override
	public void play() {
		System.out.println("Philips Recorder is playing");
		
	}
	
	@Override
	public void stop() {
		System.out.println("Philips Recorder is stopping");
		
	}
	
	@Override
	public void pause() {
		System.out.println("Philips Recorder is paused");
		
	}
}