package com.haruns._01_CompoundObject;

public class Ders {
	String kod;
	String ad;
	int kredi;
	
	Hoca hoca; // Dersin hocasi olur.
	Bolum bolum; // Ders bir bolume ait olur
	Ogrenci[] ogrenciler; // Dersi alan "OGRENCILER" olur.
	
	public Ders(String ad, String kod, int kredi) {
		
		this.ad = ad;
		this.kod = kod;
		this.kredi = kredi;
		ogrenciler=new Ogrenci[70];
	}
}