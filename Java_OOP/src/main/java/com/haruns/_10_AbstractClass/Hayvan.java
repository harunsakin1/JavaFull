package com.haruns._10_AbstractClass;
/*
Abstract classlardan nesne uretilemez. Fakat miras alinabilir.
 */
// Abstract sinif icinde abstract metodlar olabilir.
// non-Abstract siniflarda abstract metodlar olamaz.
// Abstract sinif icerisinde hem abstract hem de non-Abstract metod olabilir.

public abstract class Hayvan {
	private String ad;
	private int kilo;
	private int boy;
	
	
	public abstract void sesCikar(); // Abstract metodun govdesi olmaz
	// Abstract metot yazmaktaki amac, miras alan siniflarin bu metodu implemente etmeye zorlanmasidir.
	// Abstract metodlar ; ile sonlandirilir.
	
	
	public Hayvan(String ad, int boy, int kilo) {
		this.ad = ad;
		this.boy = boy;
		this.kilo = kilo;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int getBoy() {
		return boy;
	}
	
	public void setBoy(int boy) {
		this.boy = boy;
	}
	
	public int getKilo() {
		return kilo;
	}
	
	public void setKilo(int kilo) {
		this.kilo = kilo;
	}
}