package com.haruns._08_Polymorphism;

public class Kedi extends Hayvan{
	public Kedi(String ad, int boy, int kilo) {
		super(ad, boy, kilo);
	}
	
	@Override
	public void sesCikar() {
		//super.sesCikar();
		System.out.println(getAd()+" Miyav dedi");
	}
	public void temizle(){
		System.out.println(getAd()+" kendini temizledi.");
	}
	
}