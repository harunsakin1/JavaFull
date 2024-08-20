package com.haruns._15_InterfaceOrnek;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		PhilipsRecorder philipsRecorder=new PhilipsRecorder();
		philipsRecorder.record();
		philipsRecorder.pause();
		philipsRecorder.play();
		philipsRecorder.stop();
		
		DvdPlayer dvdPlayer=new DvdPlayer();
		dvdPlayer.play();
		dvdPlayer.pause();
		dvdPlayer.stop();
		
		CdPlayer cdPlayer=new CdPlayer();
		cdPlayer.play();
		cdPlayer.pause();
		cdPlayer.stop();
		
		ArrayList<Player> players=new ArrayList<>();
		players.add(philipsRecorder);
		players.add(dvdPlayer);
		players.add(cdPlayer);
		System.out.println("foreach ile tum cihazlarin play metodu cagirildi.");
		for (Player item:players){
			item.play();
		}
		
		System.out.println("foreach ile tum cihazlarin stop metodu cagirildi.");
		for (Player item:players){
			item.stop();
		}
		
		
	}
}