package com.haruns._07_Inheritance._03_Inheritance.entities;

import com.haruns._07_Inheritance._03_Inheritance.services.Personel;

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
	public int getMaasKatSayisi() {
		return 3;
	}
}