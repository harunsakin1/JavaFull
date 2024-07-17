package com.haruns._01_CompoundObject;

public class Hoca {
	String ad;
	String unvan;
	
	Bolum bolum;
	Ogrenci[] danisanOgrenciler;
	Ders[] verdigiDersler;
	
	public Hoca(String ad, String unvan) {
		this.ad = ad;
		this.unvan = unvan;
		danisanOgrenciler=new Ogrenci[10];
		verdigiDersler=new Ders[5];
	}
}