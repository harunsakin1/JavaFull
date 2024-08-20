package com.haruns._08_Polymorphism;

public class Kopek extends Hayvan{
	public Kopek(String ad, int boy, int kilo) {
		super(ad, boy, kilo);
	}
	
	@Override
	public void sesCikar() {
		//super.sesCikar();
		System.out.println(getAd() + " Hav hav dedi");
	}
}