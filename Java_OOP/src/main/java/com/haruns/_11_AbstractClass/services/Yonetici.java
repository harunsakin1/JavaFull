package com.haruns._11_AbstractClass.services;

public abstract class Yonetici extends Personel {

	public String yoneticiOzelligi;
	
	
	
	public Yonetici(String ad) {
		super(ad);
	}
	
	public void yoneticiMetodu(){
		System.out.println("yonetici metodu calisti");
	}
	
	
}