package com.haruns._07_Inheritance._02_Aggregation;

public class Araba {
	private Motor motor;
	private String marka;
	
	public Araba(String marka, Motor motor) {
		this.marka = marka;
		this.motor = motor; // Motor nesnesi disaridan parametre ile alinir.
	}
	public void arabaBilgisi(){
		System.out.println("Arabanin markasi : "+marka);
		System.out.println("Motor tipi : "+motor.getTip());
	}
}