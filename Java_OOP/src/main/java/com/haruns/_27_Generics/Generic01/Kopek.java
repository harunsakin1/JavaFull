package com.haruns._27_Generics.Generic01;

public class Kopek extends Hayvan implements IHavlayabilir {
	public Kopek(String ad, int boy, int kilo) {
		super(ad, boy, kilo);
	}
	
	@Override
	public void sesCikar() {
		//super.sesCikar();
		System.out.println(getAd() + " Hav hav dedi");
	}
	
	@Override
	public String toString() {
		return "Kopek{" + "ad='" + getAd() + '\'' + ", boy=" + getBoy() + ", kilo=" + getKilo() + '}';
	}
}