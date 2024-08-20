package com.haruns._17_Enum;

public class Personel {
	String ad;
	String adres;
	Unvanlar unvan;
	

	
	public Personel(String ad, String adres, Unvanlar unvan) {
		this.ad = ad;
		this.adres = adres;
		this.unvan = unvan;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public Unvanlar getUnvan() {
		return unvan;
	}
	
	public void setUnvan(Unvanlar unvan) {
		this.unvan = unvan;
	}
	
}