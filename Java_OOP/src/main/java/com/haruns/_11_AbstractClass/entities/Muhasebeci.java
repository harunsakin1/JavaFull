package com.haruns._11_AbstractClass.entities;

import com.haruns._11_AbstractClass.services.Personel;

public class Muhasebeci extends Personel {
	public String muhasebeciUnvani;
	
	public Muhasebeci(String ad) {
		super(ad);
	}
	
	
	@Override
//	public String getInfo() {
//		return "Muhasebeci Unvani : "+muhasebeciUnvani+" "+super.getInfo();
//	}
	public String getInfo() {
		return "Muhasebeci{" + "muhasebeciUnvani='" + muhasebeciUnvani + '\'' +super.getInfo()+ '}';
	}
	
	@Override
	public void zamIste() {
		System.out.println("Muhasebeci zam istiyor");
	}
	
	@Override
	public int getMaasKatSayisi() {
		return 3;
	}
}