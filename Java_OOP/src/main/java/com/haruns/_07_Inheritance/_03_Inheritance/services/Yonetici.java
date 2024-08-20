package com.haruns._07_Inheritance._03_Inheritance.services;

public class Yonetici extends Personel  {

	public String yoneticiOzelligi;
	
	
	
	public Yonetici(String ad) {
		super(ad);
	}
	
	public void yoneticiMetodu(){
		System.out.println("yonetici metodu calisti");
	}
	
	
}