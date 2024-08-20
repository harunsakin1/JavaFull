package com.haruns._11_AbstractClass.entities;

import com.haruns._11_AbstractClass.services.Personel;

public class Muhendis extends Personel {
	public String uzmanlikAlani;
	public String calismaSekli;
	
	public Muhendis(String ad, String tel, int maasKatSayisi) {
		super(ad, tel, maasKatSayisi);
		
	}
	
	@Override
	public void zamIste() {
		System.out.println("Muhendis cok zam istiyor");
	}
	
	
	@Override
	public int getMaasKatSayisi() {
		return 4;
	}
}