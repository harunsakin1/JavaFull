package com.haruns._08_Polymorphism;
/*
Abstract classlardan nesne uretilemez. Fakat miras alinabilir.
 */

public abstract class Hayvan {
	private String ad;
	private int kilo;
	private int boy;
	
	
	public void sesCikar(){
		System.out.println("Hayvan ses cikardi.");
	}
	
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