package com.haruns._09_ArrayList;

public class Kisi {
	private String ad;
	private String soyAd;
	
	public Kisi(String ad, String soyAd) {
		this.ad = ad;
		this.soyAd = soyAd;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyAd() {
		return soyAd;
	}
	
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	
	@Override
	public String toString() {
		return "{" + "ad='" + getAd() + '\'' + ", soyAd='" + getSoyAd() + '\'' + '}';
	}
}