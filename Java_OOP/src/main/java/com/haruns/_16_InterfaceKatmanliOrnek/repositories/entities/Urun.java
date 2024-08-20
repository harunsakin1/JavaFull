package com.haruns._16_InterfaceKatmanliOrnek.repositories.entities;

public class Urun {
	static Integer urunIndex=0;
	Integer urunId;
	String ad;
	String marka;
	Double fiyat;
	
	public Urun(String ad,  String marka, Double fiyat) {
		this.ad = ad;
		this.fiyat = fiyat;
		this.marka = marka;
		this.urunId=++urunIndex;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public Double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public Integer getUrunId() {
		return urunId;
	}
	
	@Override
	public String toString() {
		return "Urun{" + "urunId=" + getUrunId() + ", ad='"
				+ getAd() + '\'' + ", marka='"
				+ getMarka() + '\'' + ", fiyat="
				+ getFiyat() + '}';
	}
}