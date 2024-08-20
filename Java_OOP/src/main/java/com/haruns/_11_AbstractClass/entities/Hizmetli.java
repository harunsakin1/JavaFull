package com.haruns._11_AbstractClass.entities;

import com.haruns._11_AbstractClass.services.Personel;

public class Hizmetli extends Personel {
	public String gorevAlani;
	
	public Hizmetli(String ad) {
		super(ad);
	}
	
	@Override
	public void zamIste() {
		System.out.println("Hizmetli zam istiyor");
	}
}