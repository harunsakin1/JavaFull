package com.haruns._01_CompoundObject;

public class Ogrenci {
	String no;
	String ad;
	
	Bolum bolum;
	Ders[] aldigiDersler;
	Hoca danisman;
	
	public Ogrenci(String ad, String no) {
		this.ad = ad;
		this.no = no;
		aldigiDersler=new Ders[8];
	}
}