package com.haruns._16_InterfaceKatmanliOrnek.repositories.entities;

import java.util.UUID;

public class Musteri {
	String musteriId;
	String ad;
	String soyAd;
	String kullaniciAdi;
	String sifre;
	String adres;
	
	public Musteri(String ad, String soyAd, String kullaniciAdi, String sifre, String adres) {
		this.musteriId = UUID.randomUUID().toString();
		this.ad = ad;
		this.soyAd = soyAd;
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
		this.adres = adres;
	}
	
	public String getMusteriId() {
		return musteriId;
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
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	
	public String getSifre() {
		return sifre;
	}
	
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	@Override
	public String toString() {
		return "Musteri{" + "musteriId='" + getMusteriId() + '\''
				+ ", ad='" + getAd() + '\'' + ", soyAd='"
				+ getSoyAd() + '\'' + ", kullaniciAdi='"
				+ getKullaniciAdi() + '\'' + ", sifre='"
				+ getSifre() + '\'' + ", adres='"
				+ getAdres() + '\'' + '}';
	}
}