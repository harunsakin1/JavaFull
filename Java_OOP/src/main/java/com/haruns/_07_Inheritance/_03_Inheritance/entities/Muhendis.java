package com.haruns._07_Inheritance._03_Inheritance.entities;

import com.haruns._07_Inheritance._03_Inheritance.services.Personel;

public class Muhendis extends Personel {
	public String uzmanlikAlani;
	public String calismaSekli;
	
	public Muhendis(String ad, String tel, int maasKatSayisi) {
		super(ad, tel, maasKatSayisi);
		
	}
	
	
	@Override
	public int getMaasKatSayisi() {
		return 4;
	}
}