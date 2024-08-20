package com.haruns._27_Generics.Generic01;

public class Kedi extends Hayvan {
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
	
	@Override
	public String toString() {
		return "Kedi{" + "ad='" + getAd() + '\'' + ", boy=" + getBoy() + ", kilo=" + getKilo() + '}';
	}
}